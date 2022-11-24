/**
 * generated by Xtext 2.23.0
 */
package externals.externals.formatting2;

import com.google.inject.Inject;
import externals.ExternalsRoot;
import externals.ExternalsRootAPIDescriptions;
import externals.ExternalsRootAPIDescriptionsItems;
import externals.ExternalsRootPropertiesAbstract;
import externals.externals.services.ExternalsGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ExternalsFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private ExternalsGrammarAccess _externalsGrammarAccess;
  
  protected void _format(final ExternalsRoot externalsRoot, @Extension final IFormattableDocument document) {
    EList<ExternalsRootPropertiesAbstract> _externalsRoot = externalsRoot.getExternalsRoot();
    for (final ExternalsRootPropertiesAbstract externalsRootPropertiesAbstract : _externalsRoot) {
      document.<ExternalsRootPropertiesAbstract>format(externalsRootPropertiesAbstract);
    }
  }
  
  protected void _format(final ExternalsRootAPIDescriptions externalsRootAPIDescriptions, @Extension final IFormattableDocument document) {
    EList<ExternalsRootAPIDescriptionsItems> _aPIDescriptions = externalsRootAPIDescriptions.getAPIDescriptions();
    for (final ExternalsRootAPIDescriptionsItems externalsRootAPIDescriptionsItems : _aPIDescriptions) {
      document.<ExternalsRootAPIDescriptionsItems>format(externalsRootAPIDescriptionsItems);
    }
  }
  
  public void format(final Object externalsRootAPIDescriptions, final IFormattableDocument document) {
    if (externalsRootAPIDescriptions instanceof XtextResource) {
      _format((XtextResource)externalsRootAPIDescriptions, document);
      return;
    } else if (externalsRootAPIDescriptions instanceof ExternalsRootAPIDescriptions) {
      _format((ExternalsRootAPIDescriptions)externalsRootAPIDescriptions, document);
      return;
    } else if (externalsRootAPIDescriptions instanceof ExternalsRoot) {
      _format((ExternalsRoot)externalsRootAPIDescriptions, document);
      return;
    } else if (externalsRootAPIDescriptions instanceof EObject) {
      _format((EObject)externalsRootAPIDescriptions, document);
      return;
    } else if (externalsRootAPIDescriptions == null) {
      _format((Void)null, document);
      return;
    } else if (externalsRootAPIDescriptions != null) {
      _format(externalsRootAPIDescriptions, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(externalsRootAPIDescriptions, document).toString());
    }
  }
}
