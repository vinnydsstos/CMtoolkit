package Modules.PreProcessing.Impl;

import Modules.Input.FilesLoader;
import Util.Paths;
import Util.StringUtils;
import java.util.ArrayList;

public class ListOfWordsStopwordsRemover{

    public ArrayList<String> removeStopwords(String contentToRemoveStopwords) {
        
        ArrayList<String> words = StringUtils.stringToArrayOfWords(contentToRemoveStopwords);

        ArrayList<String> stopWordsList = FilesLoader.loadSingleFile(Paths.STOPWORDS);
        ArrayList<String> retorno = new ArrayList<>();

        for (String s : words) {
            if (!stopWordsList.contains(s.toLowerCase())) {
                retorno.add(s);
            }
        }

        return retorno;
    }
}
