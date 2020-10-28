import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { BookZonePublicGwSharedModule } from 'app/shared/shared.module';

import { DocsComponent } from './docs.component';

import { docsRoute } from './docs.route';

@NgModule({
  imports: [BookZonePublicGwSharedModule, RouterModule.forChild([docsRoute])],
  declarations: [DocsComponent],
})
export class DocsModule {}
