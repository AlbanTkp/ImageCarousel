package xid220.cse216.lehigh.edu.imagecarousel;

public class MyImages extends MainActivity {
   int ImageId = 0;
   String ImageCaption = "";
   public static String getImageCaption() {
   return(ImageCaption);
    }

     public void setImageCaption() {
       this.ImageCaption = ImageCaption;
     }

     public int  getImageId(){
       return ImageId;
     }
     public void setImageId() {
       this.ImageId = ImageId;
     }
    }



