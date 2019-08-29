import { NgModule } from '@angular/core';

import { KafkaspringbootExampleSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
  imports: [KafkaspringbootExampleSharedLibsModule],
  declarations: [JhiAlertComponent, JhiAlertErrorComponent],
  exports: [KafkaspringbootExampleSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class KafkaspringbootExampleSharedCommonModule {}
