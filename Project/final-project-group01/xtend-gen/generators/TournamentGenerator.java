package generators;

import fta_domain_model.Fta_domain_modelPackage;
import fta_domain_model.Tournament;
import fta_domain_model.TournamentType;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class TournamentGenerator {
  public static void main(final String[] args) {
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
    Map<String, Object> _extensionToFactoryMap_1 = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl_1 = new XMIResourceFactoryImpl();
    _extensionToFactoryMap_1.put("ecore", _xMIResourceFactoryImpl_1);
    final ResourceSetImpl resourceSet = new ResourceSetImpl();
    final Resource ecoreResource = resourceSet.getResource(URI.createURI("model/fta_domain_model.ecore"), true);
    try {
      ecoreResource.load(null);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        String _message = e.getMessage();
        String _plus = ("Error loading ecore: " + _message);
        InputOutput.<String>println(_plus);
        e.printStackTrace();
        return;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    if (((!ecoreResource.getContents().isEmpty()) && (IterableExtensions.<EObject>head(ecoreResource.getContents()) instanceof EPackage))) {
      EObject _head = IterableExtensions.<EObject>head(ecoreResource.getContents());
      final EPackage ePackage = ((EPackage) _head);
      String _nsURI = ePackage.getNsURI();
      String _plus = ("Registering ePackage with nsURI: " + _nsURI);
      InputOutput.<String>println(_plus);
      EPackage.Registry.INSTANCE.put(ePackage.getNsURI(), ePackage);
    } else {
      InputOutput.<String>println("Error: Ecore resource contains no EPackage.");
      return;
    }
    Fta_domain_modelPackage.eINSTANCE.eClass();
    final List<String> xmiFiles = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("model/instancesXMI/round_robin_tournament.xmi"));
    for (final String xmiFile : xmiFiles) {
      {
        InputOutput.<String>println(("\nLaster inn XMI-modellen: " + xmiFile));
        final Resource xmiResource = resourceSet.getResource(URI.createURI(xmiFile), true);
        try {
          xmiResource.load(null);
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception e = (Exception)_t;
            String _message = e.getMessage();
            String _plus_1 = ("Error loading xmi: " + _message);
            InputOutput.<String>println(_plus_1);
            e.printStackTrace();
            return;
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
        InputOutput.<String>println("Starting to iterate over XMI model contents...");
        final Procedure1<EObject> _function = (EObject element) -> {
          if ((element instanceof Tournament)) {
            final Tournament tournament = ((Tournament) element);
            String _name = tournament.getName();
            String _plus_1 = ("Tournament found: " + _name);
            InputOutput.<String>println(_plus_1);
            String _string = tournament.getTournamentType().toString();
            if (_string != null) {
              switch (_string) {
                case "ROUND_ROBIN":
                  final RoundRobinHandler handler = new RoundRobinHandler();
                  handler.handleTournament(tournament);
                  break;
                default:
                  TournamentType _tournamentType = tournament.getTournamentType();
                  String _plus_2 = ("Unknown tournament type: " + _tournamentType);
                  InputOutput.<String>println(_plus_2);
                  break;
              }
            } else {
              TournamentType _tournamentType = tournament.getTournamentType();
              String _plus_2 = ("Unknown tournament type: " + _tournamentType);
              InputOutput.<String>println(_plus_2);
            }
          }
        };
        IteratorExtensions.<EObject>forEach(xmiResource.getAllContents(), _function);
      }
    }
  }
}
