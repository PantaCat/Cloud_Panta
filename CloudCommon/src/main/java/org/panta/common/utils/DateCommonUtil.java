package org.panta.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCommonUtil {
    public static String dateFormatFormat(String simpleDateFormatType,Date date){
       // 定义时间格式化对象和定义格式化样式
       SimpleDateFormat dateFormat = new SimpleDateFormat(simpleDateFormatType);
       // 格式化时间对象
       return dateFormat.format(date);
    }
}
