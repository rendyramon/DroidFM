package com.stafiiyevskyi.mlsdev.droidfm.utils;

import android.content.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestAssets {

    public static String getErrorResponse(Context context) {
        return getStringFromFile(context, "error_response.json");
    }

    public static String getTopArtistsResponse(Context context) {
        return getStringFromFile(context, "top_artists_response.json");
    }

    public static String getTopArtistsPageSecondResponse(Context context) {
        return getStringFromFile(context, "top_artists_second_page_response.json");
    }

    public static String getTopTracksResponse(Context context) {
        return getStringFromFile(context, "top_tracks_response.json");
    }

    public static String getTopTracksPageSecondResponse(Context context) {
        return getStringFromFile(context, "top_tracks_second_page_response.json");
    }

    public static String getTrackDetailResponse(Context context) {
        return getStringFromFile(context, "track_detail_response.json");
    }

    public static String getRihannaAlbumsResponse(Context context) {
        return getStringFromFile(context, "top_rihanna_albums_response.json");
    }

    public static String getRihannaTracksResponse(Context context) {
        return getStringFromFile(context, "top_rihanna_tracks_response.json");
    }

    public static String getRihannaAlbumDetailResponse(Context context) {
        return getStringFromFile(context, "rihanna_album_detail_response.json");
    }

    public static String getRihannaTrackDetailResponse(Context context) {
        return getStringFromFile(context, "rihanna_track_detail_response.json");
    }

    public static String getTopAlbumsTagRock(Context context) {
        return getStringFromFile(context, "top_albums_tag_rock_resposne.json");
    }

    public static String getChartTopTags(Context context) {
        return getStringFromFile(context, "top_tag_response.json");
    }

    public static String getChartTopTracks(Context context) {
        return getStringFromFile(context, "chart_top_tracks_response.json");
    }

    public static String getChartTopArtist(Context context) {
        return getStringFromFile(context, "chart_top_artists_response.json");
    }

    public static String getTagRockTopArtists(Context context) {
        return getStringFromFile(context, "top_artists_tag_rock_response.json");
    }

    public static String getTagRockTopTracks(Context context) {
        return getStringFromFile(context, "top_tracks_tag_rock_response.json");
    }

    private static String getStringFromFile(Context context, String filePath) {
        String result = null;
        try {
            InputStream is = context.getResources().getAssets().open(filePath);
            result = convertStreamToString(is);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private static String convertStreamToString(InputStream is) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line).append("\n");
        }
        reader.close();
        return sb.toString();
    }
}


