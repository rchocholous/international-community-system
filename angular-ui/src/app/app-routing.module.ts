import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {EventsOverviewComponent} from "./events-overview/events-overview.component";
import {EventDetailComponent} from "./event-detail/event-detail.component";

const routes: Routes = [
  { path: 'list', component: EventsOverviewComponent},
  { path: 'detail', component: EventDetailComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
