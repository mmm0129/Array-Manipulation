import java.util.Arrays;

public class ArrayMaipulation {

    public ArrayMaipulation(){
        this.define();
        this.defineWithInitialValue();
        this.assignment();
        this.getElementValue();
        this.getArrayLength();
        this.getEachElementWithLoop();
        this.updateElement();
        this.addElemnt();
    }

     //変数の定義
     private void define(){
        int[] numbers = new int[5];
        String[] names = new String[3];

        //出力
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));
   }
    //変数の定義(初期値)
    private void defineWithInitialValue(){
       int[] numbers = {1,2,3,4,5};
       String[] names = {"太郎","次郎","三郎"};

       //出力
       System.out.println(Arrays.toString(numbers));
       System.out.println(Arrays.toString(names));
  }
    //代入
    private void assignment(){
        int[] numbers = new int[5];
        numbers[0] = 10; //インデックス0に１０を代入
        System.out.println(Arrays.toString(numbers));

        numbers[1] = 20; //インデックス1に2０を代入
        System.out.println(Arrays.toString(numbers));

        numbers[2] = 30; //インデックス2に3０を代入
        System.out.println(Arrays.toString(numbers));
    }
    //配列の要素取得
    private void getElementValue(){
        int[] numbers = {1,2,3,4,5};
        int value = numbers[2];
        //出力
        System.out.println(value);
    }
    //配列の長さ取得
    private void getArrayLength(){
        int[] numbers = {1,2,3,4,5};
        int length = numbers.length;
        //出力
        System.out.println(length);
    }
    //配列のループ処理
    private void getEachElementWithLoop(){
        int[] numbers = {1,2,3,4,5};
        for(int i = 0; i < numbers.length; i++){
            //出力
            System.out.println(numbers[i]);
        }
    }
    //要素の変更
    private void updateElement(){
        int[] numbers = {1,2,3,4,5};
        System.out.println(numbers[1]);

        numbers[1] = 50; //インデックス1に5０を代入
        System.out.println(numbers[1]);

    }
    //要素の追加
    private void addElemnt(){
        int[] numbers = {1,2,3,4,5};
        int[] newArray = new int[numbers.length + 1];

        System.arraycopy(numbers, 0, newArray,0,numbers.length);
        newArray[numbers.length] = 40;

        numbers = newArray;
    }
    
}
