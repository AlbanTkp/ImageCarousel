package xid220.cse216.lehigh.edu.imagecarousel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

import static xid220.cse216.lehigh.edu.imagecarousel.MyImages.getImageCaption;
import static xid220.cse216.lehigh.edu.imagecarousel.R.*;

public class MainActivity extends AppCompatActivity {
    private Integer images[] = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3,R.drawable.pic4 };
   // count num of images
    private int currImage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // create the arraylist
        ArrayList<MyImages> model = new ArrayList<>();
       //To Do should store ALL images in the arraylist
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        setInitialImage();
        setImageNextListener();
        }

    private void setImageNextListener() {
        // click button show next image
        final Button Nextbutton = (Button) findViewById(R.id.btnNextImage);
        Nextbutton.setOnClickListener(new View.OnClickListener() {
        public void onClick(View arg0){
            currImage++;
            if(currImage == 4){
                currImage = 0;
            }
            setCurrentImage();
            }
        });
    }
    private void setInitialImage() {
        // initialize the image
      setCurrentImage();
     }


     private void setCurrentImage() {
        // set the current image
     final ImageView imageView = (ImageView) findViewById(R.id.imageDisplay);
         imageView.setImageResource(images[currImage]);
        // set Tag
         //To find the proper way to set Tag
         imageView.setTag(R.id);
         imageView.getTag();
        }
        }


