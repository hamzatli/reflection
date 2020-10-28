import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import './vendor';
import { BookZonePublicGwSharedModule } from 'app/shared/shared.module';
import { BookZonePublicGwCoreModule } from 'app/core/core.module';
import { BookZonePublicGwAppRoutingModule } from './app-routing.module';
import { BookZonePublicGwHomeModule } from './home/home.module';
import { BookZonePublicGwEntityModule } from './entities/entity.module';
// jhipster-needle-angular-add-module-import JHipster will add new module here
import { MainComponent } from './layouts/main/main.component';
import { NavbarComponent } from './layouts/navbar/navbar.component';
import { FooterComponent } from './layouts/footer/footer.component';
import { PageRibbonComponent } from './layouts/profiles/page-ribbon.component';
import { ErrorComponent } from './layouts/error/error.component';

@NgModule({
  imports: [
    BrowserModule,
    BookZonePublicGwSharedModule,
    BookZonePublicGwCoreModule,
    BookZonePublicGwHomeModule,
    // jhipster-needle-angular-add-module JHipster will add new module here
    BookZonePublicGwEntityModule,
    BookZonePublicGwAppRoutingModule,
  ],
  declarations: [MainComponent, NavbarComponent, ErrorComponent, PageRibbonComponent, FooterComponent],
  bootstrap: [MainComponent],
})
export class BookZonePublicGwAppModule {}
