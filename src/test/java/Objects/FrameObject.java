package Objects;

import java.util.HashMap;

public class FrameObject {

    private String SingleFrame;
    private String MultipleFrame;

    public String getSingleFrame() {
        return SingleFrame;
    }

    public FrameObject(HashMap<String,String> TestData){
        PrepareData(TestData);
    }

    public void PrepareData(HashMap<String,String> TestData ){
        for(String Key:TestData.keySet()){
            switch (Key){
                case "SingleFrame":
                    setSingleFrame(TestData.get(Key));
                    break;
                case "MultipleFrame":
                    setMultipleFrame(TestData.get(Key));
                    break;
            }
        }
    }

    public void setSingleFrame(String singleFrame) {
        SingleFrame = singleFrame;
    }

    public String getMultipleFrame() {
        return MultipleFrame;
    }

    public void setMultipleFrame(String multipleFrame) {
        MultipleFrame = multipleFrame;
    }
}
