package com.example.caridentification;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.caverock.androidsvg.SVG;
import com.example.caridentification.databinding.RowLayoutBinding;

import java.util.ArrayList;

public class MotorAdapter extends RecyclerView.Adapter<MotorAdapter.AdapterViewHolder> {
    //
    //
    private ArrayList<Motor> motors;

    ItemClicked activity;
    Context context;

    public interface ItemClicked{
        void onItemClicked(int index);
    }


    public MotorAdapter(Context context, ArrayList<Motor> motor_list) {

        this.motors = motor_list;
        activity = (ItemClicked) context;
        this.context = context;

    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder {
        private RowLayoutBinding itemBinding;

        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            itemBinding = RowLayoutBinding.bind(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.onItemClicked(motors.indexOf( (Motor) itemView.getTag() ));
                }
            });
        }
    }
    //

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_layout, parent, false);
        return new AdapterViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {
        holder.itemView.setTag(motors.get(position));
        //
        holder.itemBinding.layoutListTvModelCar.setText( motors.get(position).getModel().toString().trim() );
        holder.itemBinding.layoutListTvOwnerCar.setText( motors.get(position).getOwnerName().toString() );
        //
        if( motors.get(position).getMake().equals("Ford") ){
            holder.itemBinding.layoutListImage.setImageResource(R.drawable.ford);}
        else if ( motors.get(position).getMake().equals("Mercedes-Benz") ) {
            holder.itemBinding.layoutListImage.setImageResource(R.drawable.mercedes); }
        else if ( motors.get(position).getMake().equals("Nissan") ) {
            holder.itemBinding.layoutListImage.setImageResource(R.drawable.nissan);}
        else if ( motors.get(position).getMake().equals("Toyota") ) {
            holder.itemBinding.layoutListImage.setImageResource(R.drawable.toyota);}
        else if ( motors.get(position).getMake().equals("BMW") ) {
            holder.itemBinding.layoutListImage.setImageResource(R.drawable.bmw);}
        else if ( motors.get(position).getMake().equals("Audi") ) {
            holder.itemBinding.layoutListImage.setImageResource(R.drawable.audi);}
        else if ( motors.get(position).getMake().equals("Chevrolet") ) {
            holder.itemBinding.layoutListImage.setImageResource(R.drawable.chevrolet);}
        else if ( motors.get(position).getMake().equals("Honda") ) {
            holder.itemBinding.layoutListImage.setImageResource(R.drawable.honda);}
        else if ( motors.get(position).getMake().equals("Hyundai") ) {
            holder.itemBinding.layoutListImage.setImageResource(R.drawable.hyundai);}
        else if ( motors.get(position).getMake().equals("Kia") ) {
            holder.itemBinding.layoutListImage.setImageResource(R.drawable.kia);}
        else if ( motors.get(position).getMake().equals("Mazda") ) {
            holder.itemBinding.layoutListImage.setImageResource(R.drawable.mazda);}
        else if ( motors.get(position).getMake().equals("Mitsubishi") ) {
            holder.itemBinding.layoutListImage.setImageResource(R.drawable.mitsubishi);}
        else if ( motors.get(position).getMake().equals("Peugeot") ) {
            holder.itemBinding.layoutListImage.setImageResource(R.drawable.peugeot);}
        else if ( motors.get(position).getMake().equals("Renault") ) {
            holder.itemBinding.layoutListImage.setImageResource(R.drawable.renault);}
        else if ( motors.get(position).getMake().equals("Subaru") ) {
            holder.itemBinding.layoutListImage.setImageResource(R.drawable.subaru);}
        else if ( motors.get(position).getMake().equals("Suzuki") ) {
            holder.itemBinding.layoutListImage.setImageResource(R.drawable.suzuki);}
        else if ( motors.get(position).getMake().equals("Volkswagen") ) {
            holder.itemBinding.layoutListImage.setImageResource(R.drawable.volkswagen);}
        else if ( motors.get(position).getMake().equals("Volvo") ) {
            holder.itemBinding.layoutListImage.setImageResource(R.drawable.volvo);}

    }

    @Override
    public int getItemCount() {
        return motors.size();
    }
}
