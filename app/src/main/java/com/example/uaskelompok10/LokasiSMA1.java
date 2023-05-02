package com.example.uaskelompok10;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class LokasiSMA1 extends FragmentActivity implements OnMapReadyCallback {
    private OnMapReadyCallback onMapReadyCallback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sma1);
        SupportMapFragment mapFragment = (SupportMapFragment)
                getSupportFragmentManager()
                .findFragmentById(R.id.btnSMA1);
        assert mapFragment != null;
        mapFragment.getMapAsync( this);
    }
    @SuppressLint("MissingPermission")
    @Override
    public void onMapReady(GoogleMap googleMap) {
        //Koordinat Lokasi SMA 1 (Latitude & Longitude)
        LatLng sma1 = new LatLng(5.187613, 97.1449438);
        //tambah marker baru dengan judul "SMA Negeri 1 Lhokseumawe"
        googleMap.addMarker(new MarkerOptions().position(sma1).title("SMA Negeri 1 Lhokseumawe")
                .snippet("Nanggroe Aceh Darussalam"));
        //memindahkan kamera ke lokasi yang telah ditentukan
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sma1, 16));
        //enable compass
        googleMap.getUiSettings().setCompassEnabled(true);
        //enable zoom control
        googleMap.getUiSettings().setZoomControlsEnabled(true);
    }
}
