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

public class LokasiSD4 extends FragmentActivity implements OnMapReadyCallback {
    private OnMapReadyCallback onMapReadyCallback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sd4);
        SupportMapFragment mapFragment = (SupportMapFragment)
                getSupportFragmentManager()
                        .findFragmentById(R.id.btnSD4);
        assert mapFragment != null;
        mapFragment.getMapAsync( this);
    }
    @SuppressLint("MissingPermission")
    @Override
    public void onMapReady(GoogleMap googleMap) {
        //Koordinat Lokasi SD 4 (Latitude & Longitude)
        LatLng sd4 = new LatLng(5.1996828, 97.1104657);
        //tambah marker baru dengan judul "SD Negeri 4 Lhokseumawe"
        googleMap.addMarker(new MarkerOptions().position(sd4).title("SD Negeri 4 Lhokseumawe")
                .snippet("Nanggroe Aceh Darussalam"));
        //memindahkan kamera ke lokasi yang telah ditentukan
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sd4, 16));
        //enable compass
        googleMap.getUiSettings().setCompassEnabled(true);
        //enable zoom control
        googleMap.getUiSettings().setZoomControlsEnabled(true);
    }
}