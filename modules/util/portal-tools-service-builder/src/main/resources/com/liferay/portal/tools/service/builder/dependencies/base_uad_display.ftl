package ${packagePath}.uad.display;

import ${apiPackagePath}.model.${entity.name};

import ${packagePath}.uad.constants.${portletShortName}UADConstants;
import com.liferay.user.associated.data.display.BaseModelUADDisplay;

import java.util.Locale;

/**
 * Provides the base implementation for the ${entity.name} UAD display.
 *
 * <p>
 * This implementation exists only as a container for the default methods
 * generated by ServiceBuilder. All custom methods should be put in
 * {@link ${entity.name}UADDisplay}.
 * </p>
 *
 * @author ${author}
 * @generated
 */
public abstract class Base${entity.name}UADDisplay extends BaseModelUADDisplay<${entity.name}> {

	public String getApplicationName() {
		return ${portletShortName}UADConstants.APPLICATION_NAME;
	}

	/**
	 * Returns an ordered string array of the fields' names to be displayed.
	 * Each field name corresponds to a table column based on the order they are
	 * specified.
	 *
	 * @return the array of field names to display
	 */
	public String[] getDisplayFieldNames() {
		return new String[]{<#list entity.UADNonanonymizableEntityColumns as uadNonanonymizableEntityColumn>"${uadNonanonymizableEntityColumn.name}"<#sep>, </#sep></#list>};
	}

	public String getKey() {
		return ${portletShortName}UADConstants.CLASS_NAME_${entity.constantName};
	}

	@Override
	public String getTypeName(Locale locale) {
		return "${entity.name}";
	}

}