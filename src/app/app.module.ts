import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { SliderComponent } from './slider/slider.component';
import { SearchComponent } from './search/search.component';
import { CartComponent } from './cart/cart.component';
import { LogoutComponent } from './logout/logout.component';
import { CategoryComponent } from './category/category.component';
import { ItemsComponent } from './items/items.component';
import { EpicComponent } from './epic/epic.component';
import { AnimatedComponent } from './animated/animated.component';
import { ComicComponent } from './comic/comic.component';
import { ThrillerComponent } from './thriller/thriller.component';
import { HorrorComponent } from './horror/horror.component';
import { LoginComponent } from './login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HeaderComponent,
    SliderComponent,
    SearchComponent,
    CartComponent,
    LogoutComponent,
    CategoryComponent,
    ItemsComponent,
    EpicComponent,
    AnimatedComponent,
    ComicComponent,
    ThrillerComponent,
    HorrorComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
