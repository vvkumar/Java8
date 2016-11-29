package com.java8.streams;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author Vijay
 * Interface to declared operations on Tech list 
 */
public interface StreamsSample {

	/**
	 * Get Total count by tech group
	 * @param techs
	 * @return Map<String, Long> - Total count by tech group
	 */
	Map<String, Long> getTechCounts(List<String> techs);
	
	/**
	 * Get distinct tech
	 * @param techs
	 * @return List<String>
	 */
	List<String> getDistinctTechs(List<String> techs);
	
	/**
	 * Get Java only techs
	 * @param techs
	 * @return List<String>
	 */
	List<String> getJavaTechs(List<String> techs);
	
	/**
	 * Get DotNet only techs
	 * @param techs
	 * @return List<String>
	 */
	List<String> getDotNetTechs(List<String> techs);
}
