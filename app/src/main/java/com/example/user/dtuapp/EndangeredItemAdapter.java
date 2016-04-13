package com.example.user.dtuapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 31-01-2016.
 */
public class EndangeredItemAdapter extends BaseAdapter {

    List<EndangeredItem> mItems;
    Context mContext;
    Counter db;
    public static final int TYPE_REGULAR = 0;
    public static final int TYPE_MAIN = 1;

    public EndangeredItemAdapter(Context context,ArrayList<EndangeredItem> arrayList) {
        super();

        mContext=context;
        mItems = arrayList;
        db=new Counter(mContext);


        EndangeredItem species = new EndangeredItem();
        species.setName("2nd Sem Group A1");
        species.setThumbnail(R.string.a1);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("2nd Sem Group A2");
        species.setThumbnail(R.string.a2);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("2nd Sem Group A3");
        species.setThumbnail(R.string.a3);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("2nd Sem Group A4");
        species.setThumbnail(R.string.a4);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("2nd Sem Group A5");
        species.setThumbnail(R.string.a5);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("2nd Sem Group A6");
        species.setThumbnail(R.string.a6);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("2nd Sem Group A7");
        species.setThumbnail(R.string.a7);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("2nd Sem Group A8");
        species.setThumbnail(R.string.a8);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("2nd Sem Group A9");
        species.setThumbnail(R.string.a9);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("2nd Sem Group A10");
        species.setThumbnail(R.string.a10);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("2nd Sem Group B1");
        species.setThumbnail(R.string.b1);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("2nd Sem Group B2");
        species.setThumbnail(R.string.b2);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("2nd Sem Group B3");
        species.setThumbnail(R.string.b3);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("2nd Sem Group B4");
        species.setThumbnail(R.string.b4);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("2nd Sem Group B5");
        species.setThumbnail(R.string.b5);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("2nd Sem Group B6");
        species.setThumbnail(R.string.b6);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("2nd Sem Group B7");
        species.setThumbnail(R.string.b7);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("2nd Sem Group B8");
        species.setThumbnail(R.string.b8);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("2nd Sem Group B9");
        species.setThumbnail(R.string.b9);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("2nd Sem Group B10");
        species.setThumbnail(R.string.b10);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("4th Sem COE Sec-A");
        species.setThumbnail(R.string.coe_a4);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("4th Sem COE Sec-B");
        species.setThumbnail(R.string.coe_b4);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("4th Sem IT Sec-A");
        species.setThumbnail(R.string.it_a4);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("4th Sem IT Sec-B");
        species.setThumbnail(R.string.it_b4);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("4th Sem SE Sec-A");
        species.setThumbnail(R.string.se_a4);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("4th Sem SE Sec-A");
        species.setThumbnail(R.string.se_b4);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("4th Sem ECE Sec-C");
        species.setThumbnail(R.string.ece_c4);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("4th Sem ECE Sec-D");
        species.setThumbnail(R.string.ece_d4);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("4th Sem ECE Sec-E");
        species.setThumbnail(R.string.ece_e4);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("4th Sem EEE Sec-1");
        species.setThumbnail(R.string.eee14);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("4th Sem EEE Sec-2");
        species.setThumbnail(R.string.eee24);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("4th Sem MECH Sec-LMN");
        species.setThumbnail(R.string.mechlmn4);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("4th Sem MECH Sec-OPQ");
        species.setThumbnail(R.string.mechopq4);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("4th Sem CIVIL Sec-A");
        species.setThumbnail(R.string.civil_a4);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("4th Sem CIVIL Sec-A");
        species.setThumbnail(R.string.civil_b4);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("4th Sem EE Sec-1");
        species.setThumbnail(R.string.ee14);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("4th Sem EE Sec-2");
        species.setThumbnail(R.string.ee24);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("4th Sem PSCT");
        species.setThumbnail(R.string.psct4);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("4th Sem EP");
        species.setThumbnail(R.string.ep4);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("4th Sem PRODUCTION");
        species.setThumbnail(R.string.prod4);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("4th Sem EN");
        species.setThumbnail(R.string.en4);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("4th Sem BIOTECH");
        species.setThumbnail(R.string.bt4);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("6th Sem COE Sec-A");
        species.setThumbnail(R.string.coe_a6);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("6th Sem COE Sec-B");
        species.setThumbnail(R.string.coe_b6);
        mItems.add(species);

            species = new EndangeredItem();
            species.setName("6th Sem IT Sec-A");
            species.setThumbnail(R.string.it_a6);
            mItems.add(species);

            species = new EndangeredItem();
            species.setName("6th Sem ECE Sec-C");
            species.setThumbnail(R.string.ece_c6);
            mItems.add(species);

            species = new EndangeredItem();
            species.setName("6th Sem ECE Sec-D");
            species.setThumbnail(R.string.ece_d6);
            mItems.add(species);

            species = new EndangeredItem();
            species.setName("6th Sem ECE Sec-E");
            species.setThumbnail(R.string.ece_e6);
            mItems.add(species);

            species = new EndangeredItem();
            species.setName("6th Sem MECH Sec-IJK");
            species.setThumbnail(R.string.mechijk6);
            mItems.add(species);

            species = new EndangeredItem();
            species.setName("6th Sem MECH Sec-LMN");
            species.setThumbnail(R.string.mechlmn6);
            mItems.add(species);

            species = new EndangeredItem();
            species.setName("6th Sem MECH Sec-OPQ");
            species.setThumbnail(R.string.mechopq6);
            mItems.add(species);

            species = new EndangeredItem();
            species.setName("6th Sem CIVIL Sec-A");
            species.setThumbnail(R.string.civil_a6);
            mItems.add(species);

            species = new EndangeredItem();
            species.setName("6th Sem CIVIL Sec-B");
            species.setThumbnail(R.string.civil_b6);
            mItems.add(species);

            species = new EndangeredItem();
            species.setName("6th Sem MCE Sec-A");
            species.setThumbnail(R.string.mce_a6);
            mItems.add(species);

            species = new EndangeredItem();
            species.setName("6th Sem PSCT");
            species.setThumbnail(R.string.psct6);
            mItems.add(species);

            species = new EndangeredItem();
            species.setName("6th Sem EP");
            species.setThumbnail(R.string.ep6);
            mItems.add(species);

            species = new EndangeredItem();
            species.setName("6th Sem PRODUCTION");
            species.setThumbnail(R.string.prod6);
            mItems.add(species);

        if(db.isEmpty()){
            for (EndangeredItem item : mItems) {
                db.add(item.getThumbnail(),item.getName());
            }
        }
        else{
            arrayList=db.getAllDetails();

            mItems=arrayList;

        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        EndangeredItem endangeredItem = mItems.get(position);


            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(position==0)
            convertView = inflater.inflate(R.layout.list_item_main, null);
        else
            convertView = inflater.inflate(R.layout.list_item, null);

        TextView tv = (TextView) convertView.findViewById(R.id.tv);
        ImageView iv = (ImageView) convertView.findViewById(R.id.iv);

        tv.setText(endangeredItem.getName());


        try {
            Picasso.with(mContext).load(mContext.getResources().getString(endangeredItem.getThumbnail()).toString()).into(iv);
        }
        catch (Exception e){
            iv.setImageResource(R.drawable.nointernet);
            e.printStackTrace();
        }
        return convertView;
    }

    public static Bitmap decodeSampledBitmapFromResource(Resources res, int resId,
                                                         int reqWidth, int reqHeight) {

        // First decode with inJustDecodeBounds=true to check dimensions
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, resId, options);

        // Calculate inSampleSize
        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);

        // Decode bitmap with inSampleSize set
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(res, resId, options);
    }

    public static int calculateInSampleSize(
            BitmapFactory.Options options, int reqWidth, int reqHeight) {
        // Raw height and width of image
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {

            final int halfHeight = height / 2;
            final int halfWidth = width / 2;

            // Calculate the largest inSampleSize value that is a power of 2 and keeps both
            // height and width larger than the requested height and width.
            while ((halfHeight / inSampleSize) > reqHeight
                    && (halfWidth / inSampleSize) > reqWidth) {
                inSampleSize *= 2;
            }
        }

        return inSampleSize;
    }
    @Override
    public int getCount() {
        return mItems.size();

    }
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }
    public void show(int position){
       db.update(mItems.get(position).getThumbnail());
        Toast.makeText(mContext, "item clicked" + String.valueOf(db.getDetail(mItems.get(position).getThumbnail())),
                Toast.LENGTH_SHORT).show();
    }


}
