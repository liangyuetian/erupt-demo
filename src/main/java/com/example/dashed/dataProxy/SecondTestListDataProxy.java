package com.example.dashed.dataProxy;

import com.example.dashed.model.TestList;
import com.example.dashed.util.FormatSecond;
import xyz.erupt.annotation.fun.DataProxy;

import java.util.Collection;
import java.util.Map;

public class SecondTestListDataProxy implements DataProxy<TestList> {
    @Override
    public void afterFetch(Collection<Map<String, Object>> testList) {
        testList.forEach((item) -> {
            if (item.containsKey("created_time")) {
                item.replace("created_time", FormatSecond.formatSecond(Long.parseLong((String) item.get("created_time"))));
            }
            if (item.containsKey("updated_time")) {
                item.replace("updated_time", FormatSecond.formatSecond(Long.parseLong((String) item.get("updated_time"))));
            }
        });
    }
}
