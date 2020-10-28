package az.crbn.bookzone.publicgw;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {

        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("az.crbn.bookzone.publicgw");

        noClasses()
            .that()
                .resideInAnyPackage("az.crbn.bookzone.publicgw.service..")
            .or()
                .resideInAnyPackage("az.crbn.bookzone.publicgw.repository..")
            .should().dependOnClassesThat()
                .resideInAnyPackage("..az.crbn.bookzone.publicgw.web..")
        .because("Services and repositories should not depend on web layer")
        .check(importedClasses);
    }
}
