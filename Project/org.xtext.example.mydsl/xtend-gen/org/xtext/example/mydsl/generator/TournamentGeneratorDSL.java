package org.xtext.example.mydsl.generator;

import fta_domain_model.Fta_domain_modelPackage;
import fta_domain_model.Tournament;
import fta_domain_model.TournamentType;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.example.mydsl.MyDslStandaloneSetup;

@SuppressWarnings("all")
public class TournamentGeneratorDSL {
  public static void main(final String[] args) {
    MyDslStandaloneSetup.doSetup();
    final Fta_domain_modelPackage ePackage = Fta_domain_modelPackage.eINSTANCE;
    EPackage.Registry.INSTANCE.put(ePackage.getNsURI(), ePackage);
    final ResourceSetImpl resourceSet = new ResourceSetImpl();
    final HashMap<String, String> tournamentMap = new HashMap<String, String>();
    tournamentMap.put("Round Robin", "src/instancesDSL/roundRobin.mydsl");
    tournamentMap.put("League", "src/instancesDSL//league.mydsl");
    tournamentMap.put("Knockout Single Elimination", "src/instancesDSL/knockoutSingleElim.mydsl");
    tournamentMap.put("Knockout Double Elimination", "src/instancesDSL/knockoutDoubleElim.mydsl");
    InputOutput.<String>println("Available Tournaments:");
    int index = 1;
    Set<Map.Entry<String, String>> _entrySet = tournamentMap.entrySet();
    for (final Map.Entry<String, String> entry : _entrySet) {
      {
        String _plus = (Integer.valueOf(index) + ". ");
        String _key = entry.getKey();
        String _plus_1 = (_plus + _key);
        InputOutput.<String>println(_plus_1);
        index++;
      }
    }
    InputOutput.<String>println("Enter the number corresponding to the tournament you want to load: ");
    final Scanner scanner = new Scanner(System.in);
    int choice = (-1);
    while (((choice < 1) || (choice > tournamentMap.size()))) {
      try {
        choice = Integer.parseInt(scanner.nextLine());
        if (((choice < 1) || (choice > tournamentMap.size()))) {
          InputOutput.<String>println("Invalid choice. Please select a valid tournament number.");
        }
      } catch (final Throwable _t) {
        if (_t instanceof NumberFormatException) {
          InputOutput.<String>println("Invalid input. Please enter a number.");
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    Object _get = tournamentMap.entrySet().toArray()[(choice - 1)];
    final Map.Entry<String, String> selectedTournament = ((Map.Entry<String, String>) _get);
    final String selectedFile = selectedTournament.getValue();
    String _key = selectedTournament.getKey();
    String _plus = ("\nLoading tournament: " + _key);
    String _plus_1 = (_plus + " from file: ");
    String _plus_2 = (_plus_1 + selectedFile);
    InputOutput.<String>println(_plus_2);
    final Resource dslResource = resourceSet.getResource(URI.createFileURI(selectedFile), true);
    try {
      dslResource.load(null);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        String _message = e.getMessage();
        String _plus_3 = ("Error loading .mydsl file: " + _message);
        InputOutput.<String>println(_plus_3);
        e.printStackTrace();
        return;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    InputOutput.<String>println("Iterating over DSL model contents...");
    final Procedure1<EObject> _function = (EObject element) -> {
      if ((element instanceof Tournament)) {
        final Tournament tournament = ((Tournament) element);
        String _name = tournament.getName();
        String _plus_3 = ("Tournament found: " + _name);
        InputOutput.<String>println(_plus_3);
        String _string = tournament.getTournamentType().toString();
        if (_string != null) {
          switch (_string) {
            case "ROUND_ROBIN":
              final RoundRobinHandlerDSL handler = new RoundRobinHandlerDSL();
              handler.handleTournament(tournament);
              break;
            case "LEAGUE":
              final LeagueHandlerDSL handler_1 = new LeagueHandlerDSL();
              handler_1.handleTournament(tournament);
              break;
            case "KNOCKOUT":
              final KnockoutHandlerDSL handler_2 = new KnockoutHandlerDSL();
              handler_2.handleTournament(tournament);
              break;
            default:
              TournamentType _tournamentType = tournament.getTournamentType();
              String _plus_4 = ("Unknown tournament type: " + _tournamentType);
              InputOutput.<String>println(_plus_4);
              break;
          }
        } else {
          TournamentType _tournamentType = tournament.getTournamentType();
          String _plus_4 = ("Unknown tournament type: " + _tournamentType);
          InputOutput.<String>println(_plus_4);
        }
      }
    };
    IteratorExtensions.<EObject>forEach(dslResource.getAllContents(), _function);
  }
}
