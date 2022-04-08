import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SingleBox{
    public float width=0;
    public float length=0;

    public SingleBox(float width,float length){
        this.width=width;
        this.length=length;
    }
}

public class Box
{
    public static void main(String[] args){
        Box test = new Box();

        test.getWidth();
        test.addBoxes();

        SingleBox test1 = test.joinDiagonal();
        System.out.println("Skosne polaczenie:" + "Szerokosc: " + test1.width + " Dlugosc: " + test1.length);

        SingleBox test2 = test.joinHorizontal();
        System.out.println("Poziome polaczenie: " + "Szerokosc: " + test2.width + " Dlugosc: " + test2.length);

        SingleBox test3 = test.joinVertical();
        System.out.println("Pionowe polaczenie: " + "Szerokosc: " + test3.width + " Dlugosc: " + test3.length);
    }


    private ArrayList<SingleBox> boxes= new ArrayList<SingleBox>();
    private List<Float> widthInput= new ArrayList<Float>();

    public void getWidth(){

        Scanner scan = new Scanner(System.in);
        final String line = scan.nextLine();
        final Scanner lineScanner = new Scanner(line);

        while(lineScanner.hasNextFloat()) {
            widthInput.add(lineScanner.nextFloat());
        }
    }

    public void addBoxes(){
        float width;
        for (float input :widthInput) {
            boxes.add(new SingleBox(input, input * 2));
        }
    }

    public SingleBox joinDiagonal(){
        float sumL=0;
        float sumW=0;

        for(SingleBox box : boxes){
            sumW+=box.width;
            sumL+=box.length;
        }
        return new SingleBox(sumW, sumL);
    }

    public SingleBox joinHorizontal(){
        float sumL=0;
        float maxW=0;

        for(SingleBox box : boxes){
            if(box.width>maxW)
                maxW=box.width;

            sumL+=box.length;
        }

        return new SingleBox(maxW, sumL);
    }

    public SingleBox joinVertical(){
        float maxL=0;
        float sumW=0;
        for(SingleBox box : boxes){
            if(box.length>maxL)
                maxL=box.length;

            sumW+=box.width;
        }

        return new SingleBox(sumW, maxL);
    }


}

class Boxes
{
    private ArrayList<SingleBox> boxes= new ArrayList<SingleBox>();
    private List<Float> widthInput= new ArrayList<Float>();

    public void getWidth(){

        Scanner scan = new Scanner(System.in);
        final String line = scan.nextLine();
        final Scanner lineScanner = new Scanner(line);

        while(lineScanner.hasNextFloat()) {
            widthInput.add(lineScanner.nextFloat());
        }
    }

    public void addBoxes(){
        float width;
        for (float input :widthInput) {
            boxes.add(new SingleBox(input, input * 2));
        }
    }

    public SingleBox joinDiagonal(){
        float sumL=0;
        float sumW=0;

        for(SingleBox box : boxes){
            sumW+=box.width;
            sumL+=box.length;
        }
        return new SingleBox(sumW, sumL);
    }

    public SingleBox joinHorizontal(){
        float sumL=0;
        float maxW=0;

        for(SingleBox box : boxes){
            if(box.width>maxW)
                maxW=box.width;

            sumL+=box.length;
        }

        return new SingleBox(maxW, sumL);
    }

    public SingleBox joinVertical(){
        float maxL=0;
        float sumW=0;
        for(SingleBox box : boxes){
            if(box.length>maxL)
                maxL=box.length;

            sumW+=box.width;
        }

        return new SingleBox(sumW, maxL);
    }




    public static void main(String[] args){
        Box test = new Box();

        test.getWidth();
        test.addBoxes();

        SingleBox test1 = test.joinDiagonal();
        System.out.println("Skosne polaczenie:" + "Szerokosc: " + test1.width + " Dlugosc: " + test1.length);

        SingleBox test2 = test.joinHorizontal();
        System.out.println("Poziome polaczenie: " + "Szerokosc: " + test2.width + " Dlugosc: " + test2.length);

        SingleBox test3 = test.joinVertical();
        System.out.println("Pionowe polaczenie: " + "Szerokosc: " + test3.width + " Dlugosc: " + test3.length);
    }
}