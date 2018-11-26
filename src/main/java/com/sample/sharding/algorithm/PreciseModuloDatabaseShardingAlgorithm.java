package com.sample.sharding.algorithm;

import java.util.Collection;

import org.springframework.stereotype.Service;

import io.shardingjdbc.core.api.algorithm.sharding.PreciseShardingValue;
import io.shardingjdbc.core.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

@Service
public class PreciseModuloDatabaseShardingAlgorithm implements PreciseShardingAlgorithm<String> {
    
    @Override
    public String doSharding(final Collection<String> availableTargetNames, final PreciseShardingValue<String> shardingValue) {
    	for (String each : availableTargetNames) {
            if (each.endsWith(shardingValue.getValue())) {
                return each;
            }
        }
        throw new UnsupportedOperationException();
    }
}
