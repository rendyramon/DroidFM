package com.stafiiyevskyi.mlsdev.droidfm.view;

import android.support.v7.widget.AppCompatImageView;

/**
 * Created by oleksandr on 20.04.16.
 */
public interface Navigator {

    void navigateToArtistsSearchScreen();

    void navigateToChartsContentScreen();

    void navigateToArtistContentDetailsScreen(String mbid, String artistName, String imageUrl, AppCompatImageView imageView);

    void navigateToTopTracksScreen();

    void navigateToArtistFullDetailsScreen(String mbid);

    void setDrawerToggleEnabled();

    void setDrawerToggleNotEnabled();
}
