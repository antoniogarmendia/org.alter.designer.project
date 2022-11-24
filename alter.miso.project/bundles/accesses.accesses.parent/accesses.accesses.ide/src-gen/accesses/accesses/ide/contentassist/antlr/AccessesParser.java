/*
 * generated by Xtext 2.23.0
 */
package accesses.accesses.ide.contentassist.antlr;

import accesses.accesses.ide.contentassist.antlr.internal.InternalAccessesParser;
import accesses.accesses.services.AccessesGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class AccessesParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(AccessesGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, AccessesGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsPropertiesAbstractAccess().getAlternatives(), "rule__AccessesRootExternalAccessItemsPropertiesAbstract__Alternatives");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsTriggerPropertiesAbstractAccess().getAlternatives(), "rule__AccessesRootExternalAccessItemsTriggerPropertiesAbstract__Alternatives");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsInputItemsPropertiesAbstractAccess().getAlternatives(), "rule__AccessesRootExternalAccessItemsInputItemsPropertiesAbstract__Alternatives");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsPropertiesAbstractAccess().getAlternatives(), "rule__AccessesRootExternalAccessItemsOutputItemsPropertiesAbstract__Alternatives");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsPropertiesAbstractAccess().getAlternatives(), "rule__AccessesRootExternalAccessItemsBodyItemsPropertiesAbstract__Alternatives");
			builder.put(grammarAccess.getEBooleanObjectAccess().getAlternatives(), "rule__EBooleanObject__Alternatives");
			builder.put(grammarAccess.getEDoubleObjectAccess().getAlternatives(), "rule__EDoubleObject__Alternatives");
			builder.put(grammarAccess.getVALID_STRINGAccess().getAlternatives(), "rule__VALID_STRING__Alternatives");
			builder.put(grammarAccess.getKEYWORDAccess().getAlternatives(), "rule__KEYWORD__Alternatives");
			builder.put(grammarAccess.getAccessesRootAccess().getGroup(), "rule__AccessesRoot__Group__0");
			builder.put(grammarAccess.getAccessesRootAccess().getGroup_2(), "rule__AccessesRoot__Group_2__0");
			builder.put(grammarAccess.getAccessesRootAccess().getGroup_2_1(), "rule__AccessesRoot__Group_2_1__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessAccess().getGroup(), "rule__AccessesRootExternalAccess__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessAccess().getGroup_4(), "rule__AccessesRootExternalAccess__Group_4__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessAccess().getGroup_4_1(), "rule__AccessesRootExternalAccess__Group_4_1__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsAccess().getGroup(), "rule__AccessesRootExternalAccessItems__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsAccess().getGroup_2(), "rule__AccessesRootExternalAccessItems__Group_2__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsAccess().getGroup_2_1(), "rule__AccessesRootExternalAccessItems__Group_2_1__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsNameAccess().getGroup(), "rule__AccessesRootExternalAccessItemsName__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsPathAccess().getGroup(), "rule__AccessesRootExternalAccessItemsPath__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsOntologicalAccess().getGroup(), "rule__AccessesRootExternalAccessItemsOntological__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsClassnameAccess().getGroup(), "rule__AccessesRootExternalAccessItemsClassname__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsMethodAccess().getGroup(), "rule__AccessesRootExternalAccessItemsMethod__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsAuthAccess().getGroup(), "rule__AccessesRootExternalAccessItemsAuth__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getGroup(), "rule__AccessesRootExternalAccessItemsInput__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getGroup_4(), "rule__AccessesRootExternalAccessItemsInput__Group_4__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getGroup_4_1(), "rule__AccessesRootExternalAccessItemsInput__Group_4_1__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getGroup(), "rule__AccessesRootExternalAccessItemsOutput__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getGroup_4(), "rule__AccessesRootExternalAccessItemsOutput__Group_4__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getGroup_4_1(), "rule__AccessesRootExternalAccessItemsOutput__Group_4_1__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getGroup(), "rule__AccessesRootExternalAccessItemsBody__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getGroup_4(), "rule__AccessesRootExternalAccessItemsBody__Group_4__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getGroup_4_1(), "rule__AccessesRootExternalAccessItemsBody__Group_4_1__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getGroup(), "rule__AccessesRootExternalAccessItemsTrigger__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getGroup_4(), "rule__AccessesRootExternalAccessItemsTrigger__Group_4__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getGroup_4_1(), "rule__AccessesRootExternalAccessItemsTrigger__Group_4_1__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getGroup(), "rule__AccessesRootExternalAccessItemsInputItems__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getGroup_2(), "rule__AccessesRootExternalAccessItemsInputItems__Group_2__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getGroup_2_1(), "rule__AccessesRootExternalAccessItemsInputItems__Group_2_1__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAttrAccess().getGroup(), "rule__AccessesRootExternalAccessItemsInputItemsAttr__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAPIInputAccess().getGroup(), "rule__AccessesRootExternalAccessItemsInputItemsAPIInput__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsInputItemsWayAccess().getGroup(), "rule__AccessesRootExternalAccessItemsInputItemsWay__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsInputItemsValueAccess().getGroup(), "rule__AccessesRootExternalAccessItemsInputItemsValue__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getGroup(), "rule__AccessesRootExternalAccessItemsOutputItems__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getGroup_2(), "rule__AccessesRootExternalAccessItemsOutputItems__Group_2__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getGroup_2_1(), "rule__AccessesRootExternalAccessItemsOutputItems__Group_2_1__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAttrAccess().getGroup(), "rule__AccessesRootExternalAccessItemsOutputItemsAttr__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAPIOutputAccess().getGroup(), "rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getGroup(), "rule__AccessesRootExternalAccessItemsBodyItems__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getGroup_2(), "rule__AccessesRootExternalAccessItemsBodyItems__Group_2__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getGroup_2_1(), "rule__AccessesRootExternalAccessItemsBodyItems__Group_2_1__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAttrAccess().getGroup(), "rule__AccessesRootExternalAccessItemsBodyItemsAttr__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAPIBodyAccess().getGroup(), "rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnChangeAccess().getGroup(), "rule__AccessesRootExternalAccessItemsTriggerOnChange__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnCreateAccess().getGroup(), "rule__AccessesRootExternalAccessItemsTriggerOnCreate__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnMoveAccess().getGroup(), "rule__AccessesRootExternalAccessItemsTriggerOnMove__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnDeleteAccess().getGroup(), "rule__AccessesRootExternalAccessItemsTriggerOnDelete__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnAccessAccess().getGroup(), "rule__AccessesRootExternalAccessItemsTriggerOnAccess__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnLoadAccess().getGroup(), "rule__AccessesRootExternalAccessItemsTriggerOnLoad__Group__0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsTriggerTimeTriggerAccess().getGroup(), "rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__Group__0");
			builder.put(grammarAccess.getAccessesRootAccess().getAccessesRootAssignment_2_0(), "rule__AccessesRoot__AccessesRootAssignment_2_0");
			builder.put(grammarAccess.getAccessesRootAccess().getAccessesRootAssignment_2_1_1(), "rule__AccessesRoot__AccessesRootAssignment_2_1_1");
			builder.put(grammarAccess.getAccessesRootExternalAccessAccess().getExternalAccessAssignment_4_0(), "rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_0");
			builder.put(grammarAccess.getAccessesRootExternalAccessAccess().getExternalAccessAssignment_4_1_1(), "rule__AccessesRootExternalAccess__ExternalAccessAssignment_4_1_1");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsAccess().getItemsAssignment_2_0(), "rule__AccessesRootExternalAccessItems__ItemsAssignment_2_0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsAccess().getItemsAssignment_2_1_1(), "rule__AccessesRootExternalAccessItems__ItemsAssignment_2_1_1");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsNameAccess().getNameAssignment_3(), "rule__AccessesRootExternalAccessItemsName__NameAssignment_3");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsPathAccess().getPathAssignment_2(), "rule__AccessesRootExternalAccessItemsPath__PathAssignment_2");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsOntologicalAccess().getOntologicalAssignment_2(), "rule__AccessesRootExternalAccessItemsOntological__OntologicalAssignment_2");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsClassnameAccess().getClassnameAssignment_2(), "rule__AccessesRootExternalAccessItemsClassname__ClassnameAssignment_2");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsMethodAccess().getMethodAssignment_2(), "rule__AccessesRootExternalAccessItemsMethod__MethodAssignment_2");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsAuthAccess().getAuthAssignment_2(), "rule__AccessesRootExternalAccessItemsAuth__AuthAssignment_2");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getInputAssignment_4_0(), "rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsInputAccess().getInputAssignment_4_1_1(), "rule__AccessesRootExternalAccessItemsInput__InputAssignment_4_1_1");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getOutputAssignment_4_0(), "rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsOutputAccess().getOutputAssignment_4_1_1(), "rule__AccessesRootExternalAccessItemsOutput__OutputAssignment_4_1_1");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getBodyAssignment_4_0(), "rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsBodyAccess().getBodyAssignment_4_1_1(), "rule__AccessesRootExternalAccessItemsBody__BodyAssignment_4_1_1");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getTriggerAssignment_4_0(), "rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsTriggerAccess().getTriggerAssignment_4_1_1(), "rule__AccessesRootExternalAccessItemsTrigger__TriggerAssignment_4_1_1");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getItemsAssignment_2_0(), "rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAccess().getItemsAssignment_2_1_1(), "rule__AccessesRootExternalAccessItemsInputItems__ItemsAssignment_2_1_1");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAttrAccess().getAttrAssignment_2(), "rule__AccessesRootExternalAccessItemsInputItemsAttr__AttrAssignment_2");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsInputItemsAPIInputAccess().getAPIInputAssignment_2(), "rule__AccessesRootExternalAccessItemsInputItemsAPIInput__APIInputAssignment_2");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsInputItemsWayAccess().getWayAssignment_2(), "rule__AccessesRootExternalAccessItemsInputItemsWay__WayAssignment_2");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsInputItemsValueAccess().getValueAssignment_2(), "rule__AccessesRootExternalAccessItemsInputItemsValue__ValueAssignment_2");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getItemsAssignment_2_0(), "rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAccess().getItemsAssignment_2_1_1(), "rule__AccessesRootExternalAccessItemsOutputItems__ItemsAssignment_2_1_1");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAttrAccess().getAttrAssignment_2(), "rule__AccessesRootExternalAccessItemsOutputItemsAttr__AttrAssignment_2");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsOutputItemsAPIOutputAccess().getAPIOutputAssignment_2(), "rule__AccessesRootExternalAccessItemsOutputItemsAPIOutput__APIOutputAssignment_2");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getItemsAssignment_2_0(), "rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_0");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAccess().getItemsAssignment_2_1_1(), "rule__AccessesRootExternalAccessItemsBodyItems__ItemsAssignment_2_1_1");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAttrAccess().getAttrAssignment_2(), "rule__AccessesRootExternalAccessItemsBodyItemsAttr__AttrAssignment_2");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsBodyItemsAPIBodyAccess().getAPIBodyAssignment_2(), "rule__AccessesRootExternalAccessItemsBodyItemsAPIBody__APIBodyAssignment_2");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnChangeAccess().getOnChangeAssignment_2(), "rule__AccessesRootExternalAccessItemsTriggerOnChange__OnChangeAssignment_2");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnCreateAccess().getOnCreateAssignment_2(), "rule__AccessesRootExternalAccessItemsTriggerOnCreate__OnCreateAssignment_2");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnMoveAccess().getOnMoveAssignment_2(), "rule__AccessesRootExternalAccessItemsTriggerOnMove__OnMoveAssignment_2");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnDeleteAccess().getOnDeleteAssignment_2(), "rule__AccessesRootExternalAccessItemsTriggerOnDelete__OnDeleteAssignment_2");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnAccessAccess().getOnAccessAssignment_2(), "rule__AccessesRootExternalAccessItemsTriggerOnAccess__OnAccessAssignment_2");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsTriggerOnLoadAccess().getOnLoadAssignment_2(), "rule__AccessesRootExternalAccessItemsTriggerOnLoad__OnLoadAssignment_2");
			builder.put(grammarAccess.getAccessesRootExternalAccessItemsTriggerTimeTriggerAccess().getTimeTriggerAssignment_2(), "rule__AccessesRootExternalAccessItemsTriggerTimeTrigger__TimeTriggerAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private AccessesGrammarAccess grammarAccess;

	@Override
	protected InternalAccessesParser createParser() {
		InternalAccessesParser result = new InternalAccessesParser(null);
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

	public AccessesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AccessesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
