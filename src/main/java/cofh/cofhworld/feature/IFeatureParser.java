package cofh.cofhworld.feature;

import cofh.cofhworld.feature.IConfigurableFeatureGenerator.GenRestriction;
import com.google.gson.JsonObject;
import com.typesafe.config.Config;
import org.apache.logging.log4j.Logger;

public interface IFeatureParser {

	/**
	 * Parse a {@link JsonObject} for registration}.
	 *
	 * @param featureName The name of the feature to register.
	 * @param genObject   The JsonObject to parse.
	 * @param log         The {@link Logger} to log debug/error/etc. messages to.
	 * @return The {@link IFeatureGenerator} to be registered with an IFeatureHandler
	 */
	IFeatureGenerator parseFeature(String featureName, Config genObject, Logger log);

	IConfigurableFeatureGenerator getFeature(String featureName, Config genObject, GenRestriction biomeRes, boolean retrogen, GenRestriction dimRes, Logger log);

}
