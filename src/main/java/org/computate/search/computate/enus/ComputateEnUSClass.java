/*
 * Copyright (c) 2018-2022 Computate Limited Liability Company in Utah, USA. 
 *
 * This program and the accompanying materials are made available under the
 * terms of the GNU GENERAL PUBLIC LICENSE Version 3 which is available at
 * 
 * https://www.gnu.org/licenses/gpl-3.0.en.html
 * 
 * You may not propagate or modify a covered work except as expressly provided 
 * under this License. Any attempt otherwise to propagate or modify it is void, 
 * and will automatically terminate your rights under this License (including 
 * any patent licenses granted under the third paragraph of section 11).
 */
package org.computate.search.computate.enus;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ComputateEnUSClass {

	/**
	 * Example: "/home/ctate/.local/src/choice-reports"
	 **/
	@JsonAlias("siteChemin_stored_string")
	private String sitePath;
	/**
	 * Example: "choice-reports"
	 **/
	@JsonAlias("siteNom_stored_string")
	private String siteName;
	/**
	 * Example: [ "BaseModel" ]
	 **/
	@JsonAlias("classeSuperParamsTypeNom_stored_strings")
	private List<String> superClassParamsTypeName;
	/**
	 * Example:
	 * "org.choicehumanitarian.reports.enus.model.donor.ChoiceDonorGen<org.choicehumanitarian.reports.enus.base.BaseModel>"
	 **/
	@JsonAlias("classeNomCompletSuper_enUS_stored_string")
	private String superClassCompleteName;
	/**
	 * Example: "org.choicehumanitarian.reports.enus.base.BaseModel"
	 **/
	@JsonAlias("classeNomCompletSuperGenerique_enUS_stored_string")
	private String superClassGenericCompleteName;
	/**
	 * Example: "org.choicehumanitarian.reports.enus.base.BaseModel"
	 **/
	@JsonAlias("classeNomCanoniqueSuperGenerique_enUS_stored_string")
	private String superClassGenericCanonicalName;
	/**
	 * Example: "BaseModel"
	 **/
	@JsonAlias("classeNomSimpleSuperGenerique_enUS_stored_string")
	private String superClassGenericSimpleName;
	/**
	 * Example: "BaseModel"
	 **/
	@JsonAlias("classeDescription_enUS_stored_string")
	private String classDescription;
	/**
	 * Example: false
	 **/
	@JsonAlias("classeEstBase_stored_boolean")
	private Boolean classIsBase;
	/**
	 * Example: true
	 **/
	@JsonAlias("classeEtendBase_stored_boolean")
	private Boolean classExtendsBase;
	/**
	 * Example: true
	 **/
	@JsonAlias("classeBaseEtendGen_stored_boolean")
	private Boolean classBaseExtendsGen;
	/**
	 * Example: true
	 **/
	@JsonAlias("classeContientRequeteSite_stored_boolean")
	private Boolean classContainsSiteRequest;
	/**
	 * Example: true
	 **/
	@JsonAlias("classeTraduire_stored_boolean")
	private Boolean classTranslate;
	/**
	 * Example: true
	 **/
	@JsonAlias("classeInitLoin_stored_boolean")
	private Boolean classInitDeep;
	/**
	 * Example: true
	 **/
	@JsonAlias("classeEtendGen_stored_boolean")
	private Boolean classExtendsGen;
	/**
	 * Example: "enUS"
	 **/
	@JsonAlias("langueNom_stored_string")
	private String languageName;
	/**
	 * Example: "2022-01-21T06:33:02.787Z"
	 **/
	@JsonAlias("modifiee_stored_date")
	private String modified;
	/**
	 * Example: "org.choicehumanitarian.reports.enus.model.donor.ChoiceDonor"
	 **/
	@JsonAlias("classeNomCanonique_enUS_stored_string")
	private String classCanonicalName;
	/**
	 * Example: "ChoiceDonor"
	 **/
	@JsonAlias("classeNomSimple_enUS_stored_string")
	private String classSimpleName;
	/**
	 * Example: "org.choicehumanitarian.reports.enus.model.donor"
	 **/
	@JsonAlias("classeNomEnsemble_enUS_stored_string")
	private String classPackageName;
	/**
	 * Example: "org.choicehumanitarian.reports.enus.model.donor.ChoiceDonorGen"
	 **/
	@JsonAlias("classeNomCanoniqueGen_enUS_stored_string")
	private String classCanonicalNameGen;
	/**
	 * Example: "ChoiceDonorGen"
	 **/
	@JsonAlias("classeNomSimpleGen_enUS_stored_string")
	private String classSimpleNameGen;
	/**
	 * Example: "org.choicehumanitarian.reports.enus.model.donor.ChoiceDonorGen"
	 **/
	@JsonAlias("classeNomCanoniqueSuper_enUS_stored_string")
	private String superClassCanonicalName;
	/**
	 * Example: "ChoiceDonorGen"
	 **/
	@JsonAlias("classeNomSimpleSuper_enUS_stored_string")
	private String superClassSimpleName;
	/**
	 * Example:
	 * "/home/ctate/.local/src/choice-reports/src/main/java/org/choicehumanitarian/reports/enus/model/donor/ChoiceDonor.java"
	 **/
	@JsonAlias("classeCheminAbsolu_stored_string")
	private String classAbsolutePath;
	/**
	 * Example:
	 * "/home/ctate/.local/src/choice-reports/src/main/java/org/choicehumanitarian/reports/enus/model/donor/ChoiceDonor.java"
	 **/
	@JsonAlias("classeChemin_enUS_stored_string")
	private String classPath;
	/**
	 * Example:
	 * "/home/ctate/.local/src/choice-reports/src/main/java/org/choicehumanitarian/reports/enus/model/donor"
	 **/
	@JsonAlias("classeCheminRepertoire_enUS_stored_string")
	private String classDirectoryPath;
	/**
	 * Example:
	 * "/home/ctate/.local/src/choice-reports/src/gen/java/org/choicehumanitarian/reports/enus/model/donor/ChoiceDonorGen.java"
	 **/
	@JsonAlias("classeCheminGen_enUS_stored_string")
	private String classPathGen;
	/**
	 * Example:
	 * "/home/ctate/.local/src/choice-reports/src/gen/java/org/choicehumanitarian/reports/enus/model/donor"
	 **/
	@JsonAlias("classeCheminRepertoireGen_enUS_stored_string")
	private String classDirectoryPathGen;
	/**
	 * Example: "org.choicehumanitarian.reports"
	 **/
	@JsonAlias("nomEnsembleDomaine_stored_string")
	private String domainPackageName;
	/**
	 * Example: [ "org.choicehumanitarian.reports.enus.model.donor.ChoiceDonor",
	 * "org.choicehumanitarian.reports.enus.base.BaseModel" ]
	 **/
	@JsonAlias("entiteClassesSuperEtMoiSansGen_stored_strings")
	private List<String> entityClassesSuperAndMeWithoutGen;
	/**
	 * Example: false
	 **/
	@JsonAlias("classeEstAbstrait_stored_boolean")
	private Boolean classIsAbstract;
	/**
	 * Example: true
	 **/
	@JsonAlias("classeModele_stored_boolean")
	private Boolean classModel;
	/**
	 * Example: true
	 **/
	@JsonAlias("classeApi_stored_boolean")
	private Boolean classApi;
	/**
	 * Example: false
	 **/
	@JsonAlias("classePageSimple_stored_boolean")
	private Boolean classSimplePage;
	/**
	 * Example: true
	 **/
	@JsonAlias("classeSauvegarde_stored_boolean")
	private Boolean classSaved;
	/**
	 * Example: "package-info"
	 **/
	@JsonAlias("classeNomSimpleApiEnsembleInfo_enUS_stored_string")
	private String classSimpleNameApiPackageInfo;
	/**
	 * Example: "ChoiceDonorEnUSGenApiServiceImpl"
	 **/
	@JsonAlias("classeNomSimpleGenApiServiceImpl_enUS_stored_string")
	private String classSimpleNameGenApiServiceImpl;
	/**
	 * Example: "ChoiceDonorEnUSApiServiceImpl"
	 **/
	@JsonAlias("classeNomSimpleApiServiceImpl_enUS_stored_string")
	private String classSimpleNameApiServiceImpl;
	/**
	 * Example: "ChoiceDonorEnUSGenApiService"
	 **/
	@JsonAlias("classeNomSimpleGenApiService_enUS_stored_string")
	private String classSimpleNameGenApiService;
	/**
	 * Example: "org.choicehumanitarian.reports.enus.model.donor.package-info"
	 **/
	@JsonAlias("classeNomCanoniqueApiEnsembleInfo_enUS_stored_string")
	private String classCanonicalNameApiPackageInfo;
	/**
	 * Example:
	 * "org.choicehumanitarian.reports.enus.model.donor.ChoiceDonorEnUSGenApiServiceImpl"
	 **/
	@JsonAlias("classeNomCanoniqueGenApiServiceImpl_enUS_stored_string")
	private String classCanonicalNameGenApiServiceImpl;
	/**
	 * Example:
	 * "org.choicehumanitarian.reports.enus.model.donor.ChoiceDonorEnUSApiServiceImpl"
	 **/
	@JsonAlias("classeNomCanoniqueApiServiceImpl_enUS_stored_string")
	private String classCanonicalNameApiServiceImpl;
	/**
	 * Example:
	 * "org.choicehumanitarian.reports.enus.model.donor.ChoiceDonorEnUSGenApiService"
	 **/
	@JsonAlias("classeNomCanoniqueGenApiService_enUS_stored_string")
	private String classCanonicalNameGenApiService;
	/**
	 * Example:
	 * "/home/ctate/.local/src/choice-reports/src/gen/java/org/choicehumanitarian/reports/enus/model/donor/package-info.java"
	 **/
	@JsonAlias("classeCheminApiEnsembleInfo_enUS_stored_string")
	private String classPathApiPackageInfo;
	/**
	 * Example:
	 * "/home/ctate/.local/src/choice-reports/src/main/java/org/choicehumanitarian/reports/enus/model/donor/ChoiceDonorEnUSGenApiServiceImpl.java"
	 **/
	@JsonAlias("classeCheminGenApiServiceImpl_enUS_stored_string")
	private String classPathGenApiServiceImpl;
	/**
	 * Example:
	 * "/home/ctate/.local/src/choice-reports/src/main/java/org/choicehumanitarian/reports/enus/model/donor/ChoiceDonorEnUSApiServiceImpl.java"
	 **/
	@JsonAlias("classeCheminApiServiceImpl_enUS_stored_string")
	private String classPathApiServiceImpl;
	/**
	 * Example:
	 * "/home/ctate/.local/src/choice-reports/src/main/java/org/choicehumanitarian/reports/enus/model/donor/ChoiceDonorEnUSGenApiService.java"
	 **/
	@JsonAlias("classeCheminGenApiService_enUS_stored_string")
	private String classPathGenApiService;
	/**
	 * Example: false
	 **/
	@JsonAlias("classePublicLire_stored_boolean")
	private Boolean classPublicRead;
	/**
	 * Example: false
	 **/
	@JsonAlias("classeRoleSession_stored_boolean")
	private Boolean classRoleSession;
	/**
	 * Example: false
	 **/
	@JsonAlias("classeRoleUtilisateur_stored_boolean")
	private Boolean classRoleUser;
	/**
	 * Example: false
	 **/
	@JsonAlias("classeRoleChacun_stored_boolean")
	private Boolean classRoleEach;
	/**
	 * Example: [ "SiteAdmin" ],
	 **/
	@JsonAlias("classeRoles_stored_strings")
	private List<String> classRoles;
	/**
	 * Example: [ "enUS" ],
	 **/
	@JsonAlias("classeRolesLangue_stored_strings")
	private List<String> classRolesLanguage;
	/**
	 * Example: true
	 **/
	@JsonAlias("classeRolesTrouves_stored_boolean")
	private Boolean classRolesFound;
	/**
	 * Example: false
	 **/
	@JsonAlias("classeRoleLiresTrouves_stored_boolean")
	private Boolean classRoleReadFound;
	/**
	 * Example: false
	 **/
	@JsonAlias("classeSessionEcrire_stored_boolean")
	private Boolean classSessionWrite;
	/**
	 * Example: false
	 **/
	@JsonAlias("classeUtilisateurEcrire_stored_boolean")
	private Boolean classUserWrite;
	/**
	 * Example: false
	 **/
	@JsonAlias("classePublicEcrire_stored_boolean")
	private Boolean classPublicWrite;
	/**
	 * Example: false
	 **/
	@JsonAlias("classeSessionLire_stored_boolean")
	private Boolean classSessionRead;
	/**
	 * Example: false
	 **/
	@JsonAlias("classeUtilisateurLire_stored_boolean")
	private Boolean classUserRead;
	/**
	 * Example: false
	 **/
	@JsonAlias("classeFiltresTrouves_stored_boolean")
	private Boolean classFiltersFound;
	/**
	 * Example: 5
	 **/
	@JsonAlias("sqlSort_stored_int")
	private Integer sqlSort;
	/**
	 * Example:
	 * "/home/ctate/.local/src/choice-reports/src/main/java/org/choicehumanitarian/reports/enus/model/donor/ChoiceDonor.java"
	 **/
	@JsonAlias("id")
	private String id;
	/**
	 * Example: true
	 **/
	@JsonAlias("partEstClasse_stored_boolean")
	private Boolean partIsClass;
	/**
	 * Example: 1
	 **/
	@JsonAlias("partNumero_stored_int")
	private Integer partNumber;
	/**
	 * Example: [ "java.math.BigDecimal", "java.util.List",
	 * "org.choicehumanitarian.reports.enus.base.BaseModel",
	 * "org.choicehumanitarian.reports.enus.wrap.Wrap" ],
	 **/
	@JsonAlias("classeImportations_enUS_stored_strings")
	private List<String> classImports;
	/**
	 * Example: [ "pageUrlApi", "pageH1" ],
	 **/
	@JsonAlias("classeEntiteVars_enUS_stored_strings")
	private List<String> classEntityVars;
	/**
	 * Example: [ "java.util.Objects", "io.vertx.core.WorkerExecutor" ]
	 **/
	@JsonAlias("classeImportationsGenApi_enUS_stored_strings")
	private List<String> classImportsGenApi;
	/**
	 * Example: [ "ChoiceReportPage" ]
	 **/
	@JsonAlias("classeAttribuerNomSimplePages_enUS_stored_strings")
	private List<String> classAttributeSimpleNamePages;
	/**
	 * Example: [ "_objectTitle", "toId" ]
	 **/
	@JsonAlias("classeMethodeVars_enUS_stored_strings")
	private List<String> classMethodVars;
	/**
	 * Example: "objectSuggest"
	 **/
	@JsonAlias("classeVarSuggere_enUS_stored_string")
	private String classVarSuggested;
	/**
	 * Example: "objectText"
	 **/
	@JsonAlias("classeVarTexte_enUS_stored_string")
	private String classVarText;
	/**
	 * Example: "pk"
	 **/
	@JsonAlias("classeVarClePrimaire_enUS_stored_string")
	private String classVarPrimaryKey;
	/**
	 * Example: "inheritPk"
	 **/
	@JsonAlias("classeVarInheritClePrimaire_enUS_stored_string")
	private String classVarInheritPrimaryKey;
	/**
	 * Example: "saves"
	 **/
	@JsonAlias("classeVarSauvegardes_enUS_stored_string")
	private String classVarSaves;
	/**
	 * Example: "id"
	 **/
	@JsonAlias("classeVarCleUnique_enUS_stored_string")
	private String classvarUniqueKey;
	/**
	 * Example: "modified"
	 **/
	@JsonAlias("classeVarModifie_enUS_stored_string")
	private String classVarModified;
	/**
	 * Example: "created"
	 **/
	@JsonAlias("classeVarCree_enUS_stored_string")
	private String classVarCreated;
	/**
	 * Example: "pageUrlId"
	 **/
	@JsonAlias("classeVarUrlId_enUS_stored_string")
	private String classVarUrlId;
	/**
	 * Example: "pageUrlPk"
	 **/
	@JsonAlias("classeVarUrlPk_enUS_stored_string")
	private String classVarUrlPk;
	/**
	 * Example: "objectId"
	 **/
	@JsonAlias("classeVarId_enUS_stored_string")
	private String classVarId;
	/**
	 * Example: "objectTitle"
	 **/
	@JsonAlias("classeVarTitre_enUS_stored_string")
	private String classVarTitle;
	/**
	 * Example: false
	 **/
	@JsonAlias("classeMotsClesTrouves_stored_boolean")
	private Boolean classKeywordsFound;
	/**
	 * Example: "org.choicehumanitarian.reports.enus.model.donor.ChoiceDonor"
	 **/
	@JsonAlias("classePageNomCanonique_enUS_stored_string")
	private String classPageCanonicalName;
	/**
	 * Example: "ChoiceDonorPage"
	 **/
	@JsonAlias("classePageNomSimple_enUS_stored_string")
	private String classPageSimpleName;
	/**
	 * Example: "ChoiceDonorGenPage"
	 **/
	@JsonAlias("classeGenPageNomSimple_enUS_stored_string")
	private String classGenPageSimpleName;
	/**
	 * Example: "org.choicehumanitarian.reports.enus.model.donor.ChoiceDonorGenPage"
	 **/
	@JsonAlias("classeGenPageNomCanonique_enUS_stored_string")
	private String classGenPageCanonicalName;
	/**
	 * Example:
	 * "/home/ctate/.local/src/choice-reports/src/main/java/org/choicehumanitarian/reports/enus/model/donor/ChoiceDonorGenPage.java"
	 **/
	@JsonAlias("classeGenPageChemin_enUS_stored_string")
	private String classGenPagePath;
	/**
	 * Example:
	 * "/home/ctate/.local/src/choice-reports/src/main/java/org/choicehumanitarian/reports/enus/model/donor/ChoiceDonorPage.java"
	 **/
	@JsonAlias("classePageChemin_enUS_stored_string")
	private String classPagePath;
	/**
	 * Example:
	 * "/home/ctate/.local/src/choice-reports-static/css/enUS/ChoiceDonorPage.css"
	 **/
	@JsonAlias("classePageCheminCss_enUS_stored_string")
	private String classPagePathCss;
	/**
	 * Example:
	 * "/home/ctate/.local/src/choice-reports-static/js/enUS/ChoiceDonorPage.js"
	 **/
	@JsonAlias("classePageCheminJs_enUS_stored_string")
	private String classPagePathJs;
	/**
	 * Example:
	 * "/home/ctate/.local/src/choice-reports/src/main/resources/templates/enUS/ChoiceDonorPage.hbs"
	 **/
	@JsonAlias("classePageCheminHbs_enUS_stored_string")
	private String classPagePathHbs;
	/**
	 * Example:
	 * "/home/ctate/.local/src/choice-reports/src/main/resources/templates/enUS/ChoiceDonorGenPage.hbs"
	 **/
	@JsonAlias("classeGenPageCheminHbs_enUS_stored_string")
	private String classGenPagePathHbs;
	/**
	 * Example: "enUS"
	 **/
	@JsonAlias("classePageLangueNom_enUS_stored_string")
	private String classPageLanguageName;
	/**
	 * Example: "org.choicehumanitarian.reports.enus.base.BaseModelPage"
	 **/
	@JsonAlias("classePageSuperNomCanonique_enUS_stored_string")
	private String classPageSuperCanonicalName;
	/**
	 * Example: "BaseModelPage"
	 **/
	@JsonAlias("classePageSuperNomSimple_enUS_stored_string")
	private String classSuperPageSimpleName;
	/**
	 * Example: [ "java.lang.String", "java.lang.Long" ]
	 **/
	@JsonAlias("classeImportationsGenPage_enUS_stored_strings")
	private List<String> classImportsGenPage;
	/**
	 * Example: "/api/donor"
	 **/
	@JsonAlias("classeApiUri_enUS_stored_string")
	private String classApiUri;
	/**
	 * Example: "Donor"
	 **/
	@JsonAlias("classeApiTag_enUS_stored_string")
	private String classApiTag;
	/**
	 * Example: [ "PUTImport", "POST", "PATCH", "GET", "Search", "SearchPage" ]
	 **/
	@JsonAlias("classeApiMethodes_enUS_stored_strings")
	private List<String> classApiMethods;
	/**
	 * Example: true
	 **/
	@JsonAlias("classeContexte_stored_boolean")
	private Boolean classContext;
	/**
	 * Example: "light-green"
	 **/
	@JsonAlias("classeCouleur_stored_string")
	private String classColor;
	/**
	 * Example: "duotone"
	 **/
	@JsonAlias("classeIconeGroupe_stored_string")
	private String classIconGroup;
	/**
	 * Example: "hands-heart"
	 **/
	@JsonAlias("classeIconeNom_stored_string")
	private String classIconName;
	/**
	 * Example: 100
	 **/
	@JsonAlias("classeLignes_stored_int")
	private Integer classRows;
	/**
	 * Example: "a donor"
	 **/
	@JsonAlias("classeUnNom_enUS_stored_string")
	private String contextAName;
	/**
	 * Example: "donor"
	 **/
	@JsonAlias("classeNomSingulier_enUS_stored_string")
	private String classNameSingular;
	/**
	 * Example: "donors"
	 **/
	@JsonAlias("classeNomPluriel_enUS_stored_string")
	private String classNamePlural;
	/**
	 * Example: "donor"
	 **/
	@JsonAlias("classeNomVar_enUS_stored_string")
	private String classNameVar;
	/**
	 * Example: "the donors"
	 **/
	@JsonAlias("classeLesNoms_enUS_stored_string")
	private String classTheNames;
	/**
	 * Example: "donor"
	 **/
	@JsonAlias("classeNomAdjectifSingulier_enUS_stored_string")
	private String classNameAdjectiveSingular;
	/**
	 * Example: "donors"
	 **/
	@JsonAlias("classeNomAdjectifPluriel_enUS_stored_string")
	private String classNameAdjectivePlural;
	/**
	 * Example: "this "
	 **/
	@JsonAlias("classeCe_enUS_stored_string")
	private String classThis;
	/**
	 * Example: "a "
	 **/
	@JsonAlias("classeUn_enUS_stored_string")
	private String classA;
	/**
	 * Example: "created "
	 **/
	@JsonAlias("classeCree_enUS_stored_string")
	private String classCreated;
	/**
	 * Example: "modified "
	 **/
	@JsonAlias("classeModifie_enUS_stored_string")
	private String classModified;
	/**
	 * Example: "current donor"
	 **/
	@JsonAlias("classeNomActuel_enUS_stored_string")
	private String classActualName;
	/**
	 * Example: "all "
	 **/
	@JsonAlias("classeTous_enUS_stored_string")
	private String classAll;
	/**
	 * Example: "all the donors"
	 **/
	@JsonAlias("classeTousNom_enUS_stored_string")
	private String classAllName;
	/**
	 * Example: "search donors by "
	 **/
	@JsonAlias("classeRechercherTousNomPar_enUS_stored_string")
	private String classSearchAllNameBy;
	/**
	 * Example: "search donors"
	 **/
	@JsonAlias("classeRechercherTousNomr_enUS_stored_string")
	private String classSearchAllName;
	/**
	 * Example: "no donor found"
	 **/
	@JsonAlias("classeAucunNomTrouve_enUS_stored_string")
	private String classNoNameFound;
	/**
	 * Example: "a donor"
	 **/
	@JsonAlias("classeUnNomAdjectif_enUS_stored_string")
	private String classANameAdjective;
	/**
	 * Example: "this donor"
	 **/
	@JsonAlias("classeCeNom_enUS_stored_string")
	private String classThisName;
	/**
	 * Example: "the donor"
	 **/
	@JsonAlias("classeLeNom_enUS_stored_string")
	private String classTheName;
	/**
	 * Example: "of donor"
	 **/
	@JsonAlias("classeDeNom_enUS_stored_string")
	private String classOfName;
	/**
	 * Example: "this "
	 **/
	@JsonAlias("classeCeMinuscule_enUS_stored_string")
	private String classThisLowercase;
	/**
	 * Example: "donors"
	 **/
	@JsonAlias("classeTitre_enUS_stored_string")
	private String classTitle;
	/**
	 * Example: true
	 **/
	@JsonAlias("classeIndexe_stored_boolean")
	private Boolean classIndexed;
	/**
	 * Example: false
	 **/
	@JsonAlias("classeImage_stored_boolean")
	private Boolean classImage;
	/**
	 * Example: true
	 **/
	@JsonAlias("classePromesse_stored_boolean")
	private Boolean classPromise;
	/**
	 * Example: [ "com.fasterxml.jackson.annotation.JsonProperty",
	 * "java.util.Arrays" ]
	 **/
	@JsonAlias("classeImportationsGen_enUS_stored_strings")
	private List<String> classImportsGen;
	/**
	 * Example: true
	 **/
	@JsonAlias("classeTrisTrouves_stored_boolean")
	private Boolean classSortsFound;
	/**
	 * Example: [ "_string" ]
	 **/
	@JsonAlias("classeTrisSuffixeType_stored_strings")
	private List<String> classSortsSuffixType;
	/**
	 * Example: [ "asc" ]
	 **/
	@JsonAlias("classeTrisOrdre_stored_strings")
	private List<String> classSortsOrder;
	/**
	 * Example: [ "objectId" ]
	 **/
	@JsonAlias("classeTrisVar_enUS_stored_strings")
	private List<String> classSortsVar;
	/**
	 * Example: true
	 **/
	@JsonAlias("classePage_stored_boolean")
	private Boolean classPage;
	/**
	 * Example: 1722544850761416700
	 */
	@JsonAlias("_version_")
	private Boolean version;

	@JsonAlias("classeSmartDataDomain_stored_string")
	private String classSmartDataDomain;

	@JsonAlias("classeSmartDataSubModule_stored_string")
	private String classSmartDataSubModule;

	@JsonAlias("classeSmartDataModel_stored_string")
	private String classSmartDataModel;

	@JsonAlias("classeModeleAlternatif_stored_string")
	private String classAlternateModel;

	public String getClassAlternateModel() {
		return classAlternateModel;
	}
	public void setClassAlternateModel(String classAlternateModel) {
		this.classAlternateModel = classAlternateModel;
	}
	public String getSitePath() {
		return sitePath;
	}
	public void setSitePath(String sitePath) {
		this.sitePath = sitePath;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public List<String> getSuperClassParamsTypeName() {
		return superClassParamsTypeName;
	}
	public void setSuperClassParamsTypeName(List<String> superClassParamsTypeName) {
		this.superClassParamsTypeName = superClassParamsTypeName;
	}
	public String getSuperClassCompleteName() {
		return superClassCompleteName;
	}
	public void setSuperClassCompleteName(String superClassCompleteName) {
		this.superClassCompleteName = superClassCompleteName;
	}
	public String getSuperClassGenericCompleteName() {
		return superClassGenericCompleteName;
	}
	public void setSuperClassGenericCompleteName(String superClassGenericCompleteName) {
		this.superClassGenericCompleteName = superClassGenericCompleteName;
	}
	public String getSuperClassGenericCanonicalName() {
		return superClassGenericCanonicalName;
	}
	public void setSuperClassGenericCanonicalName(String superClassGenericCanonicalName) {
		this.superClassGenericCanonicalName = superClassGenericCanonicalName;
	}
	public String getSuperClassGenericSimpleName() {
		return superClassGenericSimpleName;
	}
	public void setSuperClassGenericSimpleName(String superClassGenericSimpleName) {
		this.superClassGenericSimpleName = superClassGenericSimpleName;
	}
	public String getClassDescription() {
		return classDescription;
	}
	public void setClassDescription(String classDescription) {
		this.classDescription = classDescription;
	}
	public Boolean getClassIsBase() {
		return classIsBase;
	}
	public void setClassIsBase(Boolean classIsBase) {
		this.classIsBase = classIsBase;
	}
	public Boolean getClassExtendsBase() {
		return classExtendsBase;
	}
	public void setClassExtendsBase(Boolean classExtendsBase) {
		this.classExtendsBase = classExtendsBase;
	}
	public Boolean getClassBaseExtendsGen() {
		return classBaseExtendsGen;
	}
	public void setClassBaseExtendsGen(Boolean classBaseExtendsGen) {
		this.classBaseExtendsGen = classBaseExtendsGen;
	}
	public Boolean getClassContainsSiteRequest() {
		return classContainsSiteRequest;
	}
	public void setClassContainsSiteRequest(Boolean classContainsSiteRequest) {
		this.classContainsSiteRequest = classContainsSiteRequest;
	}
	public Boolean getClassTranslate() {
		return classTranslate;
	}
	public void setClassTranslate(Boolean classTranslate) {
		this.classTranslate = classTranslate;
	}
	public Boolean getClassInitDeep() {
		return classInitDeep;
	}
	public void setClassInitDeep(Boolean classInitDeep) {
		this.classInitDeep = classInitDeep;
	}
	public Boolean getClassExtendsGen() {
		return classExtendsGen;
	}
	public void setClassExtendsGen(Boolean classExtendsGen) {
		this.classExtendsGen = classExtendsGen;
	}
	public String getLanguageName() {
		return languageName;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	public String getModified() {
		return modified;
	}
	public void setModified(String modified) {
		this.modified = modified;
	}
	public String getClassCanonicalName() {
		return classCanonicalName;
	}
	public void setClassCanonicalName(String classCanonicalName) {
		this.classCanonicalName = classCanonicalName;
	}
	public String getClassSimpleName() {
		return classSimpleName;
	}
	public void setClassSimpleName(String classSimpleName) {
		this.classSimpleName = classSimpleName;
	}
	public String getClassPackageName() {
		return classPackageName;
	}
	public void setClassPackageName(String classPackageName) {
		this.classPackageName = classPackageName;
	}
	public String getClassCanonicalNameGen() {
		return classCanonicalNameGen;
	}
	public void setClassCanonicalNameGen(String classCanonicalNameGen) {
		this.classCanonicalNameGen = classCanonicalNameGen;
	}
	public String getClassSimpleNameGen() {
		return classSimpleNameGen;
	}
	public void setClassSimpleNameGen(String classSimpleNameGen) {
		this.classSimpleNameGen = classSimpleNameGen;
	}
	public String getSuperClassCanonicalName() {
		return superClassCanonicalName;
	}
	public void setSuperClassCanonicalName(String superClassCanonicalName) {
		this.superClassCanonicalName = superClassCanonicalName;
	}
	public String getSuperClassSimpleName() {
		return superClassSimpleName;
	}
	public void setSuperClassSimpleName(String superClassSimpleName) {
		this.superClassSimpleName = superClassSimpleName;
	}
	public String getClassAbsolutePath() {
		return classAbsolutePath;
	}
	public void setClassAbsolutePath(String classAbsolutePath) {
		this.classAbsolutePath = classAbsolutePath;
	}
	public String getClassPath() {
		return classPath;
	}
	public void setClassPath(String classPath) {
		this.classPath = classPath;
	}
	public String getClassDirectoryPath() {
		return classDirectoryPath;
	}
	public void setClassDirectoryPath(String classDirectoryPath) {
		this.classDirectoryPath = classDirectoryPath;
	}
	public String getClassPathGen() {
		return classPathGen;
	}
	public void setClassPathGen(String classPathGen) {
		this.classPathGen = classPathGen;
	}
	public String getClassDirectoryPathGen() {
		return classDirectoryPathGen;
	}
	public void setClassDirectoryPathGen(String classDirectoryPathGen) {
		this.classDirectoryPathGen = classDirectoryPathGen;
	}
	public String getDomainPackageName() {
		return domainPackageName;
	}
	public void setDomainPackageName(String domainPackageName) {
		this.domainPackageName = domainPackageName;
	}
	public List<String> getEntityClassesSuperAndMeWithoutGen() {
		return entityClassesSuperAndMeWithoutGen;
	}
	public void setEntityClassesSuperAndMeWithoutGen(List<String> entityClassesSuperAndMeWithoutGen) {
		this.entityClassesSuperAndMeWithoutGen = entityClassesSuperAndMeWithoutGen;
	}
	public Boolean getClassIsAbstract() {
		return classIsAbstract;
	}
	public void setClassIsAbstract(Boolean classIsAbstract) {
		this.classIsAbstract = classIsAbstract;
	}
	public Boolean getClassModel() {
		return classModel;
	}
	public void setClassModel(Boolean classModel) {
		this.classModel = classModel;
	}
	public Boolean getClassApi() {
		return classApi;
	}
	public void setClassApi(Boolean classApi) {
		this.classApi = classApi;
	}
	public Boolean getClassSimplePage() {
		return classSimplePage;
	}
	public void setClassSimplePage(Boolean classSimplePage) {
		this.classSimplePage = classSimplePage;
	}
	public Boolean getClassSaved() {
		return classSaved;
	}
	public void setClassSaved(Boolean classSaved) {
		this.classSaved = classSaved;
	}
	public String getClassSimpleNameApiPackageInfo() {
		return classSimpleNameApiPackageInfo;
	}
	public void setClassSimpleNameApiPackageInfo(String classSimpleNameApiPackageInfo) {
		this.classSimpleNameApiPackageInfo = classSimpleNameApiPackageInfo;
	}
	public String getClassSimpleNameGenApiServiceImpl() {
		return classSimpleNameGenApiServiceImpl;
	}
	public void setClassSimpleNameGenApiServiceImpl(String classSimpleNameGenApiServiceImpl) {
		this.classSimpleNameGenApiServiceImpl = classSimpleNameGenApiServiceImpl;
	}
	public String getClassSimpleNameApiServiceImpl() {
		return classSimpleNameApiServiceImpl;
	}
	public void setClassSimpleNameApiServiceImpl(String classSimpleNameApiServiceImpl) {
		this.classSimpleNameApiServiceImpl = classSimpleNameApiServiceImpl;
	}
	public String getClassSimpleNameGenApiService() {
		return classSimpleNameGenApiService;
	}
	public void setClassSimpleNameGenApiService(String classSimpleNameGenApiService) {
		this.classSimpleNameGenApiService = classSimpleNameGenApiService;
	}
	public String getClassCanonicalNameApiPackageInfo() {
		return classCanonicalNameApiPackageInfo;
	}
	public void setClassCanonicalNameApiPackageInfo(String classCanonicalNameApiPackageInfo) {
		this.classCanonicalNameApiPackageInfo = classCanonicalNameApiPackageInfo;
	}
	public String getClassCanonicalNameGenApiServiceImpl() {
		return classCanonicalNameGenApiServiceImpl;
	}
	public void setClassCanonicalNameGenApiServiceImpl(String classCanonicalNameGenApiServiceImpl) {
		this.classCanonicalNameGenApiServiceImpl = classCanonicalNameGenApiServiceImpl;
	}
	public String getClassCanonicalNameApiServiceImpl() {
		return classCanonicalNameApiServiceImpl;
	}
	public void setClassCanonicalNameApiServiceImpl(String classCanonicalNameApiServiceImpl) {
		this.classCanonicalNameApiServiceImpl = classCanonicalNameApiServiceImpl;
	}
	public String getClassCanonicalNameGenApiService() {
		return classCanonicalNameGenApiService;
	}
	public void setClassCanonicalNameGenApiService(String classCanonicalNameGenApiService) {
		this.classCanonicalNameGenApiService = classCanonicalNameGenApiService;
	}
	public String getClassPathApiPackageInfo() {
		return classPathApiPackageInfo;
	}
	public void setClassPathApiPackageInfo(String classPathApiPackageInfo) {
		this.classPathApiPackageInfo = classPathApiPackageInfo;
	}
	public String getClassPathGenApiServiceImpl() {
		return classPathGenApiServiceImpl;
	}
	public void setClassPathGenApiServiceImpl(String classPathGenApiServiceImpl) {
		this.classPathGenApiServiceImpl = classPathGenApiServiceImpl;
	}
	public String getClassPathApiServiceImpl() {
		return classPathApiServiceImpl;
	}
	public void setClassPathApiServiceImpl(String classPathApiServiceImpl) {
		this.classPathApiServiceImpl = classPathApiServiceImpl;
	}
	public String getClassPathGenApiService() {
		return classPathGenApiService;
	}
	public void setClassPathGenApiService(String classPathGenApiService) {
		this.classPathGenApiService = classPathGenApiService;
	}
	public Boolean getClassPublicRead() {
		return classPublicRead;
	}
	public void setClassPublicRead(Boolean classPublicRead) {
		this.classPublicRead = classPublicRead;
	}
	public Boolean getClassRoleSession() {
		return classRoleSession;
	}
	public void setClassRoleSession(Boolean classRoleSession) {
		this.classRoleSession = classRoleSession;
	}
	public Boolean getClassRoleUser() {
		return classRoleUser;
	}
	public void setClassRoleUser(Boolean classRoleUser) {
		this.classRoleUser = classRoleUser;
	}
	public Boolean getClassRoleEach() {
		return classRoleEach;
	}
	public void setClassRoleEach(Boolean classRoleEach) {
		this.classRoleEach = classRoleEach;
	}
	public List<String> getClassRoles() {
		return classRoles;
	}
	public void setClassRoles(List<String> classRoles) {
		this.classRoles = classRoles;
	}
	public List<String> getClassRolesLanguage() {
		return classRolesLanguage;
	}
	public void setClassRolesLanguage(List<String> classRolesLanguage) {
		this.classRolesLanguage = classRolesLanguage;
	}
	public Boolean getClassRolesFound() {
		return classRolesFound;
	}
	public void setClassRolesFound(Boolean classRolesFound) {
		this.classRolesFound = classRolesFound;
	}
	public Boolean getClassRoleReadFound() {
		return classRoleReadFound;
	}
	public void setClassRoleReadFound(Boolean classRoleReadFound) {
		this.classRoleReadFound = classRoleReadFound;
	}
	public Boolean getClassSessionWrite() {
		return classSessionWrite;
	}
	public void setClassSessionWrite(Boolean classSessionWrite) {
		this.classSessionWrite = classSessionWrite;
	}
	public Boolean getClassUserWrite() {
		return classUserWrite;
	}
	public void setClassUserWrite(Boolean classUserWrite) {
		this.classUserWrite = classUserWrite;
	}
	public Boolean getClassPublicWrite() {
		return classPublicWrite;
	}
	public void setClassPublicWrite(Boolean classPublicWrite) {
		this.classPublicWrite = classPublicWrite;
	}
	public Boolean getClassSessionRead() {
		return classSessionRead;
	}
	public void setClassSessionRead(Boolean classSessionRead) {
		this.classSessionRead = classSessionRead;
	}
	public Boolean getClassUserRead() {
		return classUserRead;
	}
	public void setClassUserRead(Boolean classUserRead) {
		this.classUserRead = classUserRead;
	}
	public Boolean getClassFiltersFound() {
		return classFiltersFound;
	}
	public void setClassFiltersFound(Boolean classFiltersFound) {
		this.classFiltersFound = classFiltersFound;
	}
	public Integer getSqlSort() {
		return sqlSort;
	}
	public void setSqlSort(Integer sqlSort) {
		this.sqlSort = sqlSort;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Boolean getPartIsClass() {
		return partIsClass;
	}
	public void setPartIsClass(Boolean partIsClass) {
		this.partIsClass = partIsClass;
	}
	public Integer getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(Integer partNumber) {
		this.partNumber = partNumber;
	}
	public List<String> getClassImports() {
		return classImports;
	}
	public void setClassImports(List<String> classImports) {
		this.classImports = classImports;
	}
	public List<String> getClassEntityVars() {
		return classEntityVars;
	}
	public void setClassEntityVars(List<String> classEntityVars) {
		this.classEntityVars = classEntityVars;
	}
	public List<String> getClassImportsGenApi() {
		return classImportsGenApi;
	}
	public void setClassImportsGenApi(List<String> classImportsGenApi) {
		this.classImportsGenApi = classImportsGenApi;
	}
	public List<String> getClassAttributeSimpleNamePages() {
		return classAttributeSimpleNamePages;
	}
	public void setClassAttributeSimpleNamePages(List<String> classAttributeSimpleNamePages) {
		this.classAttributeSimpleNamePages = classAttributeSimpleNamePages;
	}
	public List<String> getClassMethodVars() {
		return classMethodVars;
	}
	public void setClassMethodVars(List<String> classMethodVars) {
		this.classMethodVars = classMethodVars;
	}
	public String getClassVarSuggested() {
		return classVarSuggested;
	}
	public void setClassVarSuggested(String classVarSuggested) {
		this.classVarSuggested = classVarSuggested;
	}
	public String getClassVarText() {
		return classVarText;
	}
	public void setClassVarText(String classVarText) {
		this.classVarText = classVarText;
	}
	public String getClassVarPrimaryKey() {
		return classVarPrimaryKey;
	}
	public void setClassVarPrimaryKey(String classVarPrimaryKey) {
		this.classVarPrimaryKey = classVarPrimaryKey;
	}
	public String getClassVarInheritPrimaryKey() {
		return classVarInheritPrimaryKey;
	}
	public void setClassVarInheritPrimaryKey(String classVarInheritPrimaryKey) {
		this.classVarInheritPrimaryKey = classVarInheritPrimaryKey;
	}
	public String getClassVarSaves() {
		return classVarSaves;
	}
	public void setClassVarSaves(String classVarSaves) {
		this.classVarSaves = classVarSaves;
	}
	public String getClassvarUniqueKey() {
		return classvarUniqueKey;
	}
	public void setClassvarUniqueKey(String classvarUniqueKey) {
		this.classvarUniqueKey = classvarUniqueKey;
	}
	public String getClassVarModified() {
		return classVarModified;
	}
	public void setClassVarModified(String classVarModified) {
		this.classVarModified = classVarModified;
	}
	public String getClassVarCreated() {
		return classVarCreated;
	}
	public void setClassVarCreated(String classVarCreated) {
		this.classVarCreated = classVarCreated;
	}
	public String getClassVarUrlId() {
		return classVarUrlId;
	}
	public void setClassVarUrlId(String classVarUrlId) {
		this.classVarUrlId = classVarUrlId;
	}
	public String getClassVarUrlPk() {
		return classVarUrlPk;
	}
	public void setClassVarUrlPk(String classVarUrlPk) {
		this.classVarUrlPk = classVarUrlPk;
	}
	public String getClassVarId() {
		return classVarId;
	}
	public void setClassVarId(String classVarId) {
		this.classVarId = classVarId;
	}
	public String getClassVarTitle() {
		return classVarTitle;
	}
	public void setClassVarTitle(String classVarTitle) {
		this.classVarTitle = classVarTitle;
	}
	public Boolean getClassKeywordsFound() {
		return classKeywordsFound;
	}
	public void setClassKeywordsFound(Boolean classKeywordsFound) {
		this.classKeywordsFound = classKeywordsFound;
	}
	public String getClassPageCanonicalName() {
		return classPageCanonicalName;
	}
	public void setClassPageCanonicalName(String classPageCanonicalName) {
		this.classPageCanonicalName = classPageCanonicalName;
	}
	public String getClassPageSimpleName() {
		return classPageSimpleName;
	}
	public void setClassPageSimpleName(String classPageSimpleName) {
		this.classPageSimpleName = classPageSimpleName;
	}
	public String getClassGenPageSimpleName() {
		return classGenPageSimpleName;
	}
	public void setClassGenPageSimpleName(String classGenPageSimpleName) {
		this.classGenPageSimpleName = classGenPageSimpleName;
	}
	public String getClassGenPageCanonicalName() {
		return classGenPageCanonicalName;
	}
	public void setClassGenPageCanonicalName(String classGenPageCanonicalName) {
		this.classGenPageCanonicalName = classGenPageCanonicalName;
	}
	public String getClassGenPagePath() {
		return classGenPagePath;
	}
	public void setClassGenPagePath(String classGenPagePath) {
		this.classGenPagePath = classGenPagePath;
	}
	public String getClassPagePath() {
		return classPagePath;
	}
	public void setClassPagePath(String classPagePath) {
		this.classPagePath = classPagePath;
	}
	public String getClassPagePathCss() {
		return classPagePathCss;
	}
	public void setClassPagePathCss(String classPagePathCss) {
		this.classPagePathCss = classPagePathCss;
	}
	public String getClassPagePathJs() {
		return classPagePathJs;
	}
	public void setClassPagePathJs(String classPagePathJs) {
		this.classPagePathJs = classPagePathJs;
	}
	public String getClassPagePathHbs() {
		return classPagePathHbs;
	}
	public void setClassPagePathHbs(String classPagePathHbs) {
		this.classPagePathHbs = classPagePathHbs;
	}
	public String getClassGenPagePathHbs() {
		return classGenPagePathHbs;
	}
	public void setClassGenPagePathHbs(String classGenPagePathHbs) {
		this.classGenPagePathHbs = classGenPagePathHbs;
	}
	public String getClassPageLanguageName() {
		return classPageLanguageName;
	}
	public void setClassPageLanguageName(String classPageLanguageName) {
		this.classPageLanguageName = classPageLanguageName;
	}
	public String getClassPageSuperCanonicalName() {
		return classPageSuperCanonicalName;
	}
	public void setClassPageSuperCanonicalName(String classPageSuperCanonicalName) {
		this.classPageSuperCanonicalName = classPageSuperCanonicalName;
	}
	public String getClassSuperPageSimpleName() {
		return classSuperPageSimpleName;
	}
	public void setClassSuperPageSimpleName(String classSuperPageSimpleName) {
		this.classSuperPageSimpleName = classSuperPageSimpleName;
	}
	public List<String> getClassImportsGenPage() {
		return classImportsGenPage;
	}
	public void setClassImportsGenPage(List<String> classImportsGenPage) {
		this.classImportsGenPage = classImportsGenPage;
	}
	public String getClassApiUri() {
		return classApiUri;
	}
	public void setClassApiUri(String classApiUri) {
		this.classApiUri = classApiUri;
	}
	public String getClassApiTag() {
		return classApiTag;
	}
	public void setClassApiTag(String classApiTag) {
		this.classApiTag = classApiTag;
	}
	public List<String> getClassApiMethods() {
		return classApiMethods;
	}
	public void setClassApiMethods(List<String> classApiMethods) {
		this.classApiMethods = classApiMethods;
	}
	public Boolean getClassContext() {
		return classContext;
	}
	public void setClassContext(Boolean classContext) {
		this.classContext = classContext;
	}
	public String getClassColor() {
		return classColor;
	}
	public void setClassColor(String contextColor) {
		this.classColor = contextColor;
	}
	public String getClassIconGroup() {
		return classIconGroup;
	}
	public void setClassIconGroup(String contextIconGroup) {
		this.classIconGroup = contextIconGroup;
	}
	public String getClassIconName() {
		return classIconName;
	}
	public void setClassIconName(String contextIconName) {
		this.classIconName = contextIconName;
	}
	public Integer getClassRows() {
		return classRows;
	}
	public void setClassRows(Integer contextRows) {
		this.classRows = contextRows;
	}
	public String getClassAName() {
		return contextAName;
	}
	public void setClassAName(String contextAName) {
		this.contextAName = contextAName;
	}
	public String getClassNameSingular() {
		return classNameSingular;
	}
	public void setClassNameSingular(String contextNameSingular) {
		this.classNameSingular = contextNameSingular;
	}
	public String getClassNamePlural() {
		return classNamePlural;
	}
	public void setClassNamePlural(String contextNamePlural) {
		this.classNamePlural = contextNamePlural;
	}
	public String getClassNameVar() {
		return classNameVar;
	}
	public void setClassNameVar(String contextNameVar) {
		this.classNameVar = contextNameVar;
	}
	public String getClassTheNames() {
		return classTheNames;
	}
	public void setClassTheNames(String contextTheNames) {
		this.classTheNames = contextTheNames;
	}
	public String getClassNameAdjectiveSingular() {
		return classNameAdjectiveSingular;
	}
	public void setClassNameAdjectiveSingular(String contextNameAdjectiveSingular) {
		this.classNameAdjectiveSingular = contextNameAdjectiveSingular;
	}
	public String getClassNameAdjectivePlural() {
		return classNameAdjectivePlural;
	}
	public void setClassNameAdjectivePlural(String contextNameAdjectivePlural) {
		this.classNameAdjectivePlural = contextNameAdjectivePlural;
	}
	public String getClassThis() {
		return classThis;
	}
	public void setClassThis(String contextThis) {
		this.classThis = contextThis;
	}
	public String getClassA() {
		return classA;
	}
	public void setClassA(String contextA) {
		this.classA = contextA;
	}
	public String getClassCreated() {
		return classCreated;
	}
	public void setClassCreated(String contextCreated) {
		this.classCreated = contextCreated;
	}
	public String getClassModified() {
		return classModified;
	}
	public void setClassModified(String contextModified) {
		this.classModified = contextModified;
	}
	public String getClassActualName() {
		return classActualName;
	}
	public void setClassActualName(String contextActualName) {
		this.classActualName = contextActualName;
	}
	public String getClassAll() {
		return classAll;
	}
	public void setClassAll(String contextAll) {
		this.classAll = contextAll;
	}
	public String getClassAllName() {
		return classAllName;
	}
	public void setClassAllName(String contextAllName) {
		this.classAllName = contextAllName;
	}
	public String getClassSearchAllNameBy() {
		return classSearchAllNameBy;
	}
	public void setClassSearchAllNameBy(String contextSearchAllNameBy) {
		this.classSearchAllNameBy = contextSearchAllNameBy;
	}
	public String getClassSearchAllName() {
		return classSearchAllName;
	}
	public void setClassSearchAllName(String contextSearchAllName) {
		this.classSearchAllName = contextSearchAllName;
	}
	public String getClassNoNameFound() {
		return classNoNameFound;
	}
	public void setClassNoNameFound(String contextNoNameFound) {
		this.classNoNameFound = contextNoNameFound;
	}
	public String getClassANameAdjective() {
		return classANameAdjective;
	}
	public void setClassANameAdjective(String contextANameAdjective) {
		this.classANameAdjective = contextANameAdjective;
	}
	public String getClassThisName() {
		return classThisName;
	}
	public void setClassThisName(String contextThisName) {
		this.classThisName = contextThisName;
	}
	public String getClassTheName() {
		return classTheName;
	}
	public void setClassTheName(String contextTheName) {
		this.classTheName = contextTheName;
	}
	public String getClassOfName() {
		return classOfName;
	}
	public void setClassOfName(String contextOfName) {
		this.classOfName = contextOfName;
	}
	public String getClassThisLowercase() {
		return classThisLowercase;
	}
	public void setClassThisLowercase(String contextThisLowercase) {
		this.classThisLowercase = contextThisLowercase;
	}
	public String getClassTitle() {
		return classTitle;
	}
	public void setClassTitle(String contextTitle) {
		this.classTitle = contextTitle;
	}
	public Boolean getClassIndexed() {
		return classIndexed;
	}
	public void setClassIndexed(Boolean classIndexed) {
		this.classIndexed = classIndexed;
	}
	public Boolean getClassImage() {
		return classImage;
	}
	public void setClassImage(Boolean classImage) {
		this.classImage = classImage;
	}
	public Boolean getClassPromise() {
		return classPromise;
	}
	public void setClassPromise(Boolean classPromise) {
		this.classPromise = classPromise;
	}
	public List<String> getClassImportsGen() {
		return classImportsGen;
	}
	public void setClassImportsGen(List<String> classImportsGen) {
		this.classImportsGen = classImportsGen;
	}
	public Boolean getClassSortsFound() {
		return classSortsFound;
	}
	public void setClassSortsFound(Boolean classSortsFound) {
		this.classSortsFound = classSortsFound;
	}
	public List<String> getClassSortsSuffixType() {
		return classSortsSuffixType;
	}
	public void setClassSortsSuffixType(List<String> classSortsSuffixType) {
		this.classSortsSuffixType = classSortsSuffixType;
	}
	public List<String> getClassSortsOrder() {
		return classSortsOrder;
	}
	public void setClassSortsOrder(List<String> classSortsOrder) {
		this.classSortsOrder = classSortsOrder;
	}
	public List<String> getClassSortsVar() {
		return classSortsVar;
	}
	public void setClassSortsVar(List<String> classSortsVar) {
		this.classSortsVar = classSortsVar;
	}
	public Boolean getClassPage() {
		return classPage;
	}
	public void setClassPage(Boolean classPage) {
		this.classPage = classPage;
	}
	public Boolean getVersion() {
		return version;
	}
	public void setVersion(Boolean version) {
		this.version = version;
	}
	public String getContextAName() {
		return contextAName;
	}
	public void setContextAName(String contextAName) {
		this.contextAName = contextAName;
	}
	public String getClassSmartDataDomain() {
		return classSmartDataDomain;
	}
	public void setClassSmartDataDomain(String classSmartDataDomain) {
		this.classSmartDataDomain = classSmartDataDomain;
	}
	public String getClassSmartDataSubModule() {
		return classSmartDataSubModule;
	}
	public void setClassSmartDataSubModule(String classSmartDataSubModule) {
		this.classSmartDataSubModule = classSmartDataSubModule;
	}
	public String getClassSmartDataModel() {
		return classSmartDataModel;
	}
	public void setClassSmartDataModel(String classSmartDataModel) {
		this.classSmartDataModel = classSmartDataModel;
	}
}
