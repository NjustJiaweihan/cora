package com.dream.cora.support.router;

import java.util.ArrayList;
import java.util.List;

public class QuizHandlerExecutionChain {

    private List<BaseQuizHandler> handlerList;

    private int handlerIndex = 0;

    public QuizHandlerExecutionChain addHandler(BaseQuizHandler handler){
        if(handlerList == null){
            handlerList = new ArrayList<>();
        }
        handlerList.add(handler);
        return this;
    }

    public void handleNext(){

    }

    public void terminateHandler(){
        handlerIndex = handlerList.size();
    }
}
