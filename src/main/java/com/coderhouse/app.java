package com.coderhouse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class app {
    final static Logger logger= (Logger) LogManager.getLogger(app.class);
    public static void main(String[]args){
        app example=new app();
        example.runMe("test");

    }

    private void runMe(String parameter){
        if(logger.isDebugEnabled()){
            logger.debug("This is debug : {}",parameter);

        }
        if(logger.isInfoEnabled()){
            logger.info("This is info:{}",parameter);
        }
        logger.warn("This is warn: {}",parameter);
        logger.error("This is ERROR : {}", parameter);
    }


}
