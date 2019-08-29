import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { KafkaspringbootExampleSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [KafkaspringbootExampleSharedCommonModule],
  declarations: [JhiLoginModalComponent, HasAnyAuthorityDirective],
  entryComponents: [JhiLoginModalComponent],
  exports: [KafkaspringbootExampleSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class KafkaspringbootExampleSharedModule {
  static forRoot() {
    return {
      ngModule: KafkaspringbootExampleSharedModule
    };
  }
}
