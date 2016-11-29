package com.java8.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamSampleImpl implements StreamsSample {

	@Override
	public Map<String, Long> getTechCounts(List<String> techs) {
		
		if(techs == null) {
			throw new IllegalArgumentException("Tech list cannot be null");
		}
		return techs.stream().collect( Collectors.groupingBy(
                Function.identity(), Collectors.counting()));
	}

	@Override
	public List<String> getDistinctTechs(List<String> techs) {
		if(techs == null) {
			throw new IllegalArgumentException("Tech list cannot be null");
		}
		return techs.stream().distinct().collect(Collectors.toList());
	}

	@Override
	public List<String> getJavaTechs(List<String> techs) {
		if(techs == null) {
			throw new IllegalArgumentException("Tech list cannot be null");
		}
		return techs.stream().filter(tech -> tech.startsWith("Java")).collect(Collectors.toList());
	}

	@Override
	public List<String> getDotNetTechs(List<String> techs) {
		if(techs == null) {
			throw new IllegalArgumentException("Tech list cannot be null");
		}
		return techs.stream().filter(tech -> tech.startsWith("DotNet")).collect(Collectors.toList());
	}

}
