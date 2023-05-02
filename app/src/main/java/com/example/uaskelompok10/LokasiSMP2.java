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

public class LokasiSMP2 extends FragmentActivity implements OnMapReadyCallback {
    private OnMapReadyCallback onMapReadyCallback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smp2);
        SupportMapFragment mapFragment = (SupportMapFragment)
                getSupportFragmentManager()
                        .findFragmentById(R.id.btnSMP2);
        assert mapFragment != null;
        mapFragment.getMapAsync( this);
    }
    @SuppressLint("MissingPermission")
    @Override
    public void onMapReady(GoogleMap googleMap) {
        //Koordinat Lokasi SMP 2 (Latitude & Longitude)
        LatLng smp2 = new LatLng(5.1883426, 97.1446033);
        //tambah marker baru dengan judul "SMP Negeri 2 Lhokseumawe"
        googleMap.addMarker(new MarkerOptions().position(smp2).title("SMP Negeri 2 Lhokseumawe")
                .snippet("Nanggroe Aceh Darussalam"));
        //memindahkan kamera ke lokasi yang telah ditentukan
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(smp2, 16));
        //enable compass
        googleMap.getUiSettings().setCompassEnabled(true);
        //enable zoom control
        googleMap.getUiSettings().setZoomControlsEnabled(true);
    }
}
