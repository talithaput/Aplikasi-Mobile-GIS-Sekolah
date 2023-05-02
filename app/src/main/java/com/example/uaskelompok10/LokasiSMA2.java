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

public class LokasiSMA2 extends FragmentActivity implements OnMapReadyCallback {
    private OnMapReadyCallback onMapReadyCallback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sma2);
        SupportMapFragment mapFragment = (SupportMapFragment)
                getSupportFragmentManager()
                        .findFragmentById(R.id.btnSMA2);
        assert mapFragment != null;
        mapFragment.getMapAsync( this);
    }
    @SuppressLint("MissingPermission")
    @Override
    public void onMapReady(GoogleMap googleMap) {
        //Koordinat Lokasi SMA 2 (Latitude & Longitude)
        LatLng sma2 = new LatLng(5.1711743, 97.1377401);
        //tambah marker baru dengan judul "SMA Negeri 2 Lhokseumawe"
        googleMap.addMarker(new MarkerOptions().position(sma2).title("SMA Negeri 2 Lhokseumawe")
                .snippet("Nanggroe Aceh Darussalam"));
        //memindahkan kamera ke lokasi yang telah ditentukan
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sma2, 16));
        //enable compass
        googleMap.getUiSettings().setCompassEnabled(true);
        //enable zoom control
        googleMap.getUiSettings().setZoomControlsEnabled(true);
    }
}

