import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {EventsOverviewComponent} from "./events-overview/events-overview.component";
import {EventDetailComponent} from "./event-detail/event-detail.component";
import {ProfileComponent} from "./profile/profile.component";
import {BuddyComponent} from "./buddy/buddy.component";
import {OfficeHoursComponent} from "./office-hours/office-hours.component";

const routes: Routes = [
  { path: 'profile', component: ProfileComponent},
  { path: 'buddy', component: BuddyComponent},
  { path: 'office-hours', component: OfficeHoursComponent},
  { path: 'events', component: EventsOverviewComponent},
  { path: 'event/:id', component: EventDetailComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
