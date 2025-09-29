package com.example.springaioptions;


import org.springframework.ai.tool.annotation.Tool;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.i18n.LocaleContextHolder;

import java.time.LocalDateTime;

@Configurable
public class DateTimeTools {

    @Tool(name="get_current_date_time",description = " I can return to you the current date/time in the users time zone")
    public String getCurrentDateTime()
    {
        return LocalDateTime.now().atZone((LocaleContextHolder.getTimeZone().toZoneId())).toString();
    }
}
