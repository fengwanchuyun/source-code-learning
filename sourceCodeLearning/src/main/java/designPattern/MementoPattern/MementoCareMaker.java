package designPattern.MementoPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 负责人角色
 */
public class MementoCareMaker {

    private static Map<String,Map<Integer,List<ChessMemento>>> chessMap = new HashMap<>();

    private static Map<String,Integer> indexMap = new HashMap<>();

    /**
     * 走棋
     * @param chessman
     */
    public void chess(Chessman chessman){
        Map<Integer,List<ChessMemento>> chessMementoMap = chessMap.get(chessman.getLabel());
        List<ChessMemento> chessMementoList = new ArrayList<>();
        Integer index = indexMap.get(chessman.getLabel());
        if(chessMementoList == null){
            chessMementoList = new ArrayList<>();
        }
        if (index == null){
            index = 0;
        }
        chessMementoList.add(chessman.get());
        index ++;
        indexMap.put(chessman.getLabel(),index);
        chessMementoMap.put(index,chessMementoList);
        chessMap.put(chessman.getLabel(),chessMementoMap);
        chessman.show();
    }

    /**
     * 悔棋
     * @param chessman
     */
    public void redo(Chessman chessman){
        Integer index = indexMap.get(chessman.getLabel());
        Map<Integer,List<ChessMemento>> chessMementoMap =chessMap.get(chessman.getLabel());
        if(index != null && index > 0){
            List<ChessMemento> mementoList = chessMementoMap.get(index);
            mementoList.remove(mementoList.get(mementoList.size()-1));
            index --;
            indexMap.put(chessman.getLabel(),index);
            chessman.save(mementoList.get(mementoList.size()-1));
            chessman.show();
        }else {
            System.out.println(String.format("棋子：%s 未动，不能悔棋！",chessman.getLabel()));
        }

    }



}
