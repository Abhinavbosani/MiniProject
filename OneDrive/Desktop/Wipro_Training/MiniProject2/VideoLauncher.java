package Wipro_Training.oopsAndStrings;

import java.util.Scanner;

class Video {
    //static //member variables
    public String videoName;

    public  boolean Checkout;
    int rating;

    //constructor

    Video(String name){
        videoName=name;
    }

    public String getVideoName() {
        return videoName;
    }
    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }
    public void setCheckout(boolean checkout) {
        Checkout = checkout;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }


    //member functions
    String getName() {
        return videoName;

    }
    void docheckout() {
        Checkout=true;

        System.out.println("video  "+getName()+"  checked out sucessfully");
    }
    void doReturn() {
        Checkout=false;
        System.out.println("video  "+getName()+"  returned sucessfully");
    }
    void receiveRating(int rating) {
        this.rating=rating;
    }
    int getRating() {
        return rating;

    }
    boolean getCheckout() {
        return Checkout;

    }
}


class VideoStore{
    static Video[] store;

    VideoStore(String name) {

        store=new Video[5];
        // TODO Auto-generated constructor stub
    }

    //member variables

    //Video[] store;

//    VideoStore() {
//        super();
//
//        this.store = store;
//    }


    void addVideo(String name) {
        Video v=new Video(name);
        store[0]=new Video(name);
        System.out.println("video  "+store[0].getName()+"  added sucessfully");
    }

    void doCheckout(String videoName) {
        if (store[0].videoName.equals(videoName)){
            store[0].docheckout();
        }

    }
    void doReturn(String videoName) {
        if (store[0].videoName.equals(videoName)){
            store[0].doReturn();
        }

    }
    void receiveRating(String videoName,int rating) {
        if(store[0].videoName.equals(videoName)){
            store[0].receiveRating(rating);
        }
        System.out.println("Rating "+store[0].getRating()+" has been mapped to the video "+store[0].getName());

    }
    void listInventory() {
        System.out.println("------------------------------------");
        System.out.println("video name  |  checkout status  |  rating   ");
        System.out.println(store[0].getName()+"        |     "+store[0].getCheckout()+     "          |"+store[0].getRating());
        System.out.println("--------------------------------------");
    }


}

public class VideoLauncher{

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int ch;

        VideoStore vid = new VideoStore(null) ;

        do {

            System.out.println("----------- MENU---------");
            System.out.println("1.ADD VIDEO");
            System.out.println("2.CHECK OUT VIDEO");
            System.out.println("3.RETURN VIDEO");
            System.out.println("4.RECEIVE RATING");
            System.out.println("5.LIST INVENTORY");
            System.out.println("6.EXIT");
            System.out.print("ENTER YOUR CHOICE  (1.....6):");

            ch=input.nextInt();




            switch(ch){

                case 1:

                    System.out.println("Enter the name of the video you want to add : ");
                    vid.addVideo(input.next());
                    break;

                case 2:
                    System.out.println("Enter the name of the video you want to checkout : ");
                    vid.doCheckout(input.next());
                    break;


                case 3:
                    System.out.println("Enter the name of the video you want to return : ");
                    vid.doReturn(input.next());
                    break;



                case 4:
                    System.out.println("Enter the name of the video you want to give rating : ");
                    input.nextLine();
                    String n=input.nextLine();


                    System.out.println("Enter the  rating for this video : ");
                    int a=input.nextInt();

                    vid.receiveRating(n,a);



                    break;



                case 5:
                    vid.listInventory();
                    break;



                case 6:
                    System.out.println("Exiting....!.  Thanks for using application. ");
                    System.exit(1);

                    break;
            }
        }
        while(!(ch==6)) ;
        input.close();

    }



}
