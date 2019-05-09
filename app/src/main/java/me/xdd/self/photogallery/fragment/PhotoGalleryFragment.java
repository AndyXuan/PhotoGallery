package me.xdd.self.photogallery.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.xdd.self.photogallery.R;

public class PhotoGalleryFragment extends Fragment {
    private RecyclerView mRecycleView;
    public static PhotoGalleryFragment newFragment(){
        return new PhotoGalleryFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_photo_gallery,container,false);
        mRecycleView = view.findViewById(R.id.photo_recycler_view);
        mRecycleView.setLayoutManager(new GridLayoutManager(getActivity(),3));
        return view;
    }
}
