package com.xuebusi.fjf.excel.convert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;

/**
 * 可以从json串中获取指定属性的值
 */
public class JsonPropertyConvert extends AbstractConvert {

    @Override
    public String convert(Object value,String params) {

        String retVal = "";
        try {
            JSONObject jsonObject = JSON.parseObject(String.valueOf(value));

            retVal = jsonObject.getString(params);
        } catch (Exception e) {
            e.printStackTrace();
            retVal = "";
        }

        if(StringUtils.isEmpty(retVal)){
            return String.valueOf(value);
        }
        return retVal;
    }
}
