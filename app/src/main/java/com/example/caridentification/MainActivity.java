package com.example.caridentification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.caridentification.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements MotorAdapter.ItemClicked{
    ActivityMainBinding binding;
    Button btn_CarInfo, btn_OwnerInfo;
    ImageView iv_CarImage;
    TextView tv_CarModel, tv_CarModel_owner,tv_OwnerName, tv_OwnerTelNr;
    //
    private Fragment listFrag, btnFrag, carInfoFrag, ownerInfoFrag;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        //
        // inflate
        btn_CarInfo = findViewById(R.id.FragBtn_CarInfo);
        btn_OwnerInfo = findViewById(R.id.Frag_Btn_OwnerInfo);
        //
        iv_CarImage =findViewById(R.id.FragCarInfo_iv_Make);
        tv_CarModel = findViewById(R.id.FragCarInfo_tv_Model);
        //
        tv_CarModel_owner = findViewById(R.id.FragOwnerInfo_tv_CarModel);
        tv_OwnerName =findViewById(R.id.FragOwnerInfo_tv_ownerName);
        tv_OwnerTelNr = findViewById(R.id.FragOwnerInfo_tv_TelNr);
        //
        fragmentManager = getSupportFragmentManager();

        listFrag = fragmentManager.findFragmentById(R.id.main_carListFrag);
        btnFrag = fragmentManager.findFragmentById(R.id.main_ButtonsFrag);
        carInfoFrag = fragmentManager.findFragmentById(R.id.main_CarInfoFrag);
        ownerInfoFrag = fragmentManager.findFragmentById(R.id.main_carOwnerFrag);
        //
        fragmentManager.beginTransaction()
                .show(btnFrag)
                .show(listFrag)
                .show(carInfoFrag)
                .hide(ownerInfoFrag)
                .commit();
        //
        btn_CarInfo.setOnClickListener(v -> {
            fragmentManager.beginTransaction()
                    .show(btnFrag)
                    .show(listFrag)
                    .show(carInfoFrag)
                    .hide(ownerInfoFrag)
                    .commit();
        });

        btn_OwnerInfo.setOnClickListener(v -> {
            fragmentManager.beginTransaction()
                    .show(btnFrag)
                    .show(listFrag)
                    .hide(carInfoFrag)
                    .show(ownerInfoFrag)
                    .commit();
        });
        //
        onItemClicked(0);
    }

    @Override
    public void onItemClicked(int index) {

        //
        if( ApplicationClass.theListMotors.get(index).getMake().equals("Ford") ){
            iv_CarImage.setImageResource(R.drawable.ford);}
        else if ( ApplicationClass.theListMotors.get(index).getMake().equals("Mercedes-Benz") ) {
            iv_CarImage.setImageResource(R.drawable.mercedes); }
        else if ( ApplicationClass.theListMotors.get(index).getMake().equals("Nissan") ) {
            iv_CarImage.setImageResource(R.drawable.nissan);}
        else if ( ApplicationClass.theListMotors.get(index).getMake().equals("Toyota") ) {
            iv_CarImage.setImageResource(R.drawable.toyota);}
        else if ( ApplicationClass.theListMotors.get(index).getMake().equals("BMW") ) {
            iv_CarImage.setImageResource(R.drawable.bmw);}
        else if ( ApplicationClass.theListMotors.get(index).getMake().equals("Audi") ) {
            iv_CarImage.setImageResource(R.drawable.audi);}
        else if ( ApplicationClass.theListMotors.get(index).getMake().equals("Chevrolet") ) {
            iv_CarImage.setImageResource(R.drawable.chevrolet);}
        else if ( ApplicationClass.theListMotors.get(index).getMake().equals("Honda") ) {
            iv_CarImage.setImageResource(R.drawable.honda);}
        else if ( ApplicationClass.theListMotors.get(index).getMake().equals("Hyundai") ) {
            iv_CarImage.setImageResource(R.drawable.hyundai);}
        else if ( ApplicationClass.theListMotors.get(index).getMake().equals("Kia") ) {
            iv_CarImage.setImageResource(R.drawable.kia);}
        else if ( ApplicationClass.theListMotors.get(index).getMake().equals("Mazda") ) {
            iv_CarImage.setImageResource(R.drawable.mazda);}
        else if ( ApplicationClass.theListMotors.get(index).getMake().equals("Mitsubishi") ) {
            iv_CarImage.setImageResource(R.drawable.mitsubishi);}
        else if ( ApplicationClass.theListMotors.get(index).getMake().equals("Peugeot") ) {
            iv_CarImage.setImageResource(R.drawable.peugeot);}
        else if ( ApplicationClass.theListMotors.get(index).getMake().equals("Renault") ) {
            iv_CarImage.setImageResource(R.drawable.renault);}
        else if ( ApplicationClass.theListMotors.get(index).getMake().equals("Subaru") ) {
            iv_CarImage.setImageResource(R.drawable.subaru);}
        else if ( ApplicationClass.theListMotors.get(index).getMake().equals("Suzuki") ) {
            iv_CarImage.setImageResource(R.drawable.suzuki);}
        else if ( ApplicationClass.theListMotors.get(index).getMake().equals("Volkswagen") ) {
            iv_CarImage.setImageResource(R.drawable.volkswagen);}
        else if ( ApplicationClass.theListMotors.get(index).getMake().equals("Volvo") ) {
            iv_CarImage.setImageResource(R.drawable.volvo);}
        //
        tv_CarModel.setText(ApplicationClass.theListMotors.get(index).getMake()+", "
                + ApplicationClass.theListMotors.get(index).getModel());
        //
        tv_CarModel_owner.setText(ApplicationClass.theListMotors.get(index).getMake()+", "
                +ApplicationClass.theListMotors.get(index).getModel());
        tv_OwnerName.setText(ApplicationClass.theListMotors.get(index).getOwnerName());
        tv_OwnerTelNr.setText(ApplicationClass.theListMotors.get(index).getOwnerTelNr());
        //


    }
}