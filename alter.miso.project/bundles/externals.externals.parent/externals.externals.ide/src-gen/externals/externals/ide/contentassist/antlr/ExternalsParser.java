/*
 * generated by Xtext 2.23.0
 */
package externals.externals.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import externals.externals.ide.contentassist.antlr.internal.InternalExternalsParser;
import externals.externals.services.ExternalsGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ExternalsParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ExternalsGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ExternalsGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPropertiesAbstractAccess().getAlternatives(), "rule__ExternalsRootAPIDescriptionsItemsPropertiesAbstract__Alternatives");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstractAccess().getAlternatives(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsPropertiesAbstract__Alternatives");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstractAccess().getAlternatives(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsPropertiesAbstract__Alternatives");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstractAccess().getAlternatives(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsPropertiesAbstract__Alternatives");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstractAccess().getAlternatives(), "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsPropertiesAbstract__Alternatives");
			builder.put(grammarAccess.getVALID_STRINGAccess().getAlternatives(), "rule__VALID_STRING__Alternatives");
			builder.put(grammarAccess.getKEYWORDAccess().getAlternatives(), "rule__KEYWORD__Alternatives");
			builder.put(grammarAccess.getExternalsRootAccess().getGroup(), "rule__ExternalsRoot__Group__0");
			builder.put(grammarAccess.getExternalsRootAccess().getGroup_2(), "rule__ExternalsRoot__Group_2__0");
			builder.put(grammarAccess.getExternalsRootAccess().getGroup_2_1(), "rule__ExternalsRoot__Group_2_1__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsAccess().getGroup(), "rule__ExternalsRootAPIDescriptions__Group__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsAccess().getGroup_4(), "rule__ExternalsRootAPIDescriptions__Group_4__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsAccess().getGroup_4_1(), "rule__ExternalsRootAPIDescriptions__Group_4_1__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getGroup(), "rule__ExternalsRootAPIDescriptionsItems__Group__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getGroup_2(), "rule__ExternalsRootAPIDescriptionsItems__Group_2__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getGroup_2_1(), "rule__ExternalsRootAPIDescriptionsItems__Group_2_1__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsNameAccess().getGroup(), "rule__ExternalsRootAPIDescriptionsItemsName__Group__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsProtocolAccess().getGroup(), "rule__ExternalsRootAPIDescriptionsItemsProtocol__Group__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsUrlAccess().getGroup(), "rule__ExternalsRootAPIDescriptionsItemsUrl__Group__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getGroup(), "rule__ExternalsRootAPIDescriptionsItemsPaths__Group__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getGroup_4(), "rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getGroup_4_1(), "rule__ExternalsRootAPIDescriptionsItemsPaths__Group_4_1__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getGroup(), "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getGroup_4(), "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getGroup_4_1(), "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__Group_4_1__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getGroup(), "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getGroup_2(), "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getGroup_2_1(), "rule__ExternalsRootAPIDescriptionsItemsPathsItems__Group_2_1__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsRouteAccess().getGroup(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__Group__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getGroup(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getGroup_4(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getGroup_4_1(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__Group_4_1__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getGroup(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getGroup_4(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getGroup_4_1(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__Group_4_1__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getGroup(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getGroup_2(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getGroup_2_1(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__Group_2_1__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameAccess().getGroup(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__Group__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeAccess().getGroup(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__Group__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getGroup(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getGroup_2(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getGroup_2_1(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__Group_2_1__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameAccess().getGroup(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__Group__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeAccess().getGroup(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__Group__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathAccess().getGroup(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__Group__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getGroup(), "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getGroup_2(), "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getGroup_2_1(), "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__Group_2_1__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameAccess().getGroup(), "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__Group__0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyAccess().getGroup(), "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__Group__0");
			builder.put(grammarAccess.getExternalsRootAccess().getExternalsRootAssignment_2_0(), "rule__ExternalsRoot__ExternalsRootAssignment_2_0");
			builder.put(grammarAccess.getExternalsRootAccess().getExternalsRootAssignment_2_1_1(), "rule__ExternalsRoot__ExternalsRootAssignment_2_1_1");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsAccess().getAPIDescriptionsAssignment_4_0(), "rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsAccess().getAPIDescriptionsAssignment_4_1_1(), "rule__ExternalsRootAPIDescriptions__APIDescriptionsAssignment_4_1_1");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getItemsAssignment_2_0(), "rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsAccess().getItemsAssignment_2_1_1(), "rule__ExternalsRootAPIDescriptionsItems__ItemsAssignment_2_1_1");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsNameAccess().getNameAssignment_3(), "rule__ExternalsRootAPIDescriptionsItemsName__NameAssignment_3");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsProtocolAccess().getProtocolAssignment_2(), "rule__ExternalsRootAPIDescriptionsItemsProtocol__ProtocolAssignment_2");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsUrlAccess().getUrlAssignment_2(), "rule__ExternalsRootAPIDescriptionsItemsUrl__UrlAssignment_2");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getPathsAssignment_4_0(), "rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsAccess().getPathsAssignment_4_1_1(), "rule__ExternalsRootAPIDescriptionsItemsPaths__PathsAssignment_4_1_1");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getAPIAuthAssignment_4_0(), "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthAccess().getAPIAuthAssignment_4_1_1(), "rule__ExternalsRootAPIDescriptionsItemsAPIAuth__APIAuthAssignment_4_1_1");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getItemsAssignment_2_0(), "rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsAccess().getItemsAssignment_2_1_1(), "rule__ExternalsRootAPIDescriptionsItemsPathsItems__ItemsAssignment_2_1_1");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsRouteAccess().getRouteAssignment_2(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsRoute__RouteAssignment_2");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getParametersAssignment_4_0(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersAccess().getParametersAssignment_4_1_1(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParameters__ParametersAssignment_4_1_1");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getOutputsAssignment_4_0(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsAccess().getOutputsAssignment_4_1_1(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputs__OutputsAssignment_4_1_1");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getItemsAssignment_2_0(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsAccess().getItemsAssignment_2_1_1(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItems__ItemsAssignment_2_1_1");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsNameAccess().getNameAssignment_3(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsName__NameAssignment_3");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsTypeAccess().getTypeAssignment_2(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsParametersItemsType__TypeAssignment_2");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getItemsAssignment_2_0(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsAccess().getItemsAssignment_2_1_1(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItems__ItemsAssignment_2_1_1");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsNameAccess().getNameAssignment_3(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsName__NameAssignment_3");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsTypeAccess().getTypeAssignment_2(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsType__TypeAssignment_2");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPathAccess().getJSONPathAssignment_2(), "rule__ExternalsRootAPIDescriptionsItemsPathsItemsOutputsItemsJSONPath__JSONPathAssignment_2");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getItemsAssignment_2_0(), "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_0");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsAccess().getItemsAssignment_2_1_1(), "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItems__ItemsAssignment_2_1_1");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsNameAccess().getNameAssignment_3(), "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsName__NameAssignment_3");
			builder.put(grammarAccess.getExternalsRootAPIDescriptionsItemsAPIAuthItemsKeyAccess().getKeyAssignment_2(), "rule__ExternalsRootAPIDescriptionsItemsAPIAuthItemsKey__KeyAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ExternalsGrammarAccess grammarAccess;

	@Override
	protected InternalExternalsParser createParser() {
		InternalExternalsParser result = new InternalExternalsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ExternalsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ExternalsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}