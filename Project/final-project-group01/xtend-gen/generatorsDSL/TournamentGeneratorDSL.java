package generatorsDSL;

import fta_domain_model.Tournament;
import fta_domain_model.TournamentType;
import java.io.File;
import java.io.FileWriter;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class TournamentGeneratorDSL {
  public static void main(final String[] args) {
    final ResourceSetImpl resourceSet = new ResourceSetImpl();
    final List<String> myDslFiles = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("model/instancesDSL/roundRobin.mydsl"));
    for (final String myDslFile : myDslFiles) {
      {
        InputOutput.<String>println(("\nLoading DSL model: " + myDslFile));
        final Resource dslResource = resourceSet.getResource(URI.createFileURI(myDslFile), true);
        try {
          dslResource.load(null);
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception e = (Exception)_t;
            String _message = e.getMessage();
            String _plus = ("Error loading .mydsl file: " + _message);
            InputOutput.<String>println(_plus);
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
            String _plus = ("Tournament found: " + _name);
            InputOutput.<String>println(_plus);
            String _string = tournament.getTournamentType().toString();
            if (_string != null) {
              switch (_string) {
                case "ROUND_ROBIN":
                  final RoundRobinHandlerDSL handler = new RoundRobinHandlerDSL();
                  handler.handleTournament(tournament);
                  break;
                default:
                  TournamentType _tournamentType = tournament.getTournamentType();
                  String _plus_1 = ("Unknown tournament type: " + _tournamentType);
                  InputOutput.<String>println(_plus_1);
                  break;
              }
            } else {
              TournamentType _tournamentType = tournament.getTournamentType();
              String _plus_1 = ("Unknown tournament type: " + _tournamentType);
              InputOutput.<String>println(_plus_1);
            }
          }
        };
        IteratorExtensions.<EObject>forEach(dslResource.getAllContents(), _function);
      }
    }
  }

  public static void saveXtendCode(final String fileName, final String xtendCode) {
    final String outputFile = (("generated/" + fileName) + ".xtend");
    final File file = new File(outputFile);
    file.getParentFile().mkdirs();
    try {
      final FileWriter writer = new FileWriter(file);
      writer.write(xtendCode);
      writer.close();
      InputOutput.<String>println(("Generated Xtend code saved to: " + outputFile));
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        String _message = e.getMessage();
        String _plus = ("Error writing to file: " + _message);
        InputOutput.<String>println(_plus);
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
