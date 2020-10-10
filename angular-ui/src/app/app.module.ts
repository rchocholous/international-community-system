import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { EventsOverviewComponent } from './events-overview/events-overview.component';
import { EventDetailComponent } from './event-detail/event-detail.component';
import {FormsModule} from "@angular/forms";
import { ProfileComponent } from './profile/profile.component';
import { OfficeHoursComponent } from './office-hours/office-hours.component';
import { BuddyComponent } from './buddy/buddy.component';

@NgModule({
  declarations: [
    AppComponent,
    EventsOverviewComponent,
    EventDetailComponent,
    ProfileComponent,
    OfficeHoursComponent,
    BuddyComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
