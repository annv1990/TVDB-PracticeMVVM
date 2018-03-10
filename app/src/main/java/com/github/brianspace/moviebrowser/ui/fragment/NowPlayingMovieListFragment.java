/*
 * Copyright (C) 2018, Brian He
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.brianspace.moviebrowser.ui.fragment;

import android.content.Context;
import com.github.brianspace.moviebrowser.viewmodels.IMovieList;
import dagger.android.AndroidInjection;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Fragment to show the now playing movies.
 */
public class NowPlayingMovieListFragment extends MovieListFragment {

    /**
     * The view model of now playing movie list.
     */
    @Inject
    @Named("NowPlaying")
    /* default */ IMovieList nowPlayingMoviesViewModel;

    @Override
    public void onAttach(final Context context) {
        AndroidInjection.inject(this);
        super.onAttach(context);
    }

    @Override
    protected IMovieList getMovieList() {
        return nowPlayingMoviesViewModel;
    }
}