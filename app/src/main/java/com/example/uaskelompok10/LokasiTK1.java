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

public class LokasiTK1 extends FragmentActivity implements OnMapReadyCallback {
    private OnMapReadyCallback onMapReadyCallback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tk1);
        SupportMapFragment mapFragment = (SupportMapFragment)
                getSupportFragmentManager()
                        .findFragmentById(R.id.btnTK1);
        assert mapFragment != null;
        mapFragment.getMapAsync( this);
    }
    @SuppressLint("MissingPermission")
    @Override
    public void onMapReady(GoogleMap googleMap) {
        //Koordinat Lokasi TK Putroe Neng (Latitude & Longitude)
        LatLng tk1 = new LatLng(5.2099012, 97.0739778);
        //tambah marker baru dengan judul "TK Putroe Neng Lhokseumawe"
        googleMap.addMarker(new MarkerOptions().position(tk1).title("TK Putroe Neng Lhokseumawe")
                .snippet("Nanggroe Aceh Darussalam"));
        //memindahkan kamera ke lokasi yang telah ditentukan
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tk1, 16));
        //enable compass
        googleMap.getUiSettings().setCompassEnabled(true);
        //enable zoom control
        googleMap.getUiSettings().setZoomControlsEnabled(true);
    }
}
