import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { SearchComponent } from './search/search.component';
import { CartComponent } from './cart/cart.component';
import { LogoutComponent } from './logout/logout.component';
import { CategoryComponent } from './category/category.component';
import { ItemsComponent } from './items/items.component';
import { EpicComponent } from './epic/epic.component';

const routes: Routes = [

  {
    path:"home",component:HomeComponent
  },

  {
    path:"search",component:SearchComponent

  },
  {
    path:"category",component:CategoryComponent

  },

  {
    path:"cart",component:CartComponent
  },
  {
    path:"logout",component:LogoutComponent
  },
  {
    path:"items",component:ItemsComponent
  },
  {
    path:"epic",component:EpicComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
