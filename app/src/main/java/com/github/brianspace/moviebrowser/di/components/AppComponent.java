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

package com.github.brianspace.moviebrowser.di.components;

import android.content.Context;
import com.github.brianspace.moviebrowser.MovieBrowserApplication;
import com.github.brianspace.moviebrowser.di.modules.AppModule;
import com.github.brianspace.moviebrowser.di.modules.UiModule;
import com.github.brianspace.moviebrowser.di.qualifiers.ApplicationContext;
import com.github.brianspace.moviebrowser.models.ModelsModule;
import com.github.brianspace.moviebrowser.repository.local.LocalRepositoryModule;
import com.github.brianspace.moviebrowser.repository.web.MovieDbServiceModule;
import com.github.brianspace.moviebrowser.viewmodels.ViewModelsModule;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import javax.inject.Singleton;

/**
 * Dagger component for the application.
 */
@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, UiModule.class, ViewModelsModule.class,
        ModelsModule.class, LocalRepositoryModule.class, MovieDbServiceModule.class})
public interface AppComponent {

    /**
     * Provide application context.
     */
    @ApplicationContext
    Context getContext();

    /**
     * Inject MovieBrowserApplication.
     */
    void inject(MovieBrowserApplication application);
}
