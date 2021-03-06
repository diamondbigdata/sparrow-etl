/* Generated by Together */

package sparrow.etl.core.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import sparrow.etl.core.log.SparrowLogger;
import sparrow.etl.core.log.SparrowrLoggerFactory;
import sparrow.etl.jaxb.SPARROWCONFIG;
import sparrow.etl.core.exception.ConfigurationReadingException;


/**
 *
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author Saji Venugopalan
 * @version 1.0
 */
public final class XMLConfiguration
    extends ConfigurationAdapter
    implements IConfiguration {

  /**
   *
   */
  private static SparrowLogger logger = SparrowrLoggerFactory.getCurrentInstance(
      XMLConfiguration.class);

  /**
   *
   */
  private static String PACKAGE_NAME = "sparrow.etl.jaxb";

  /**
   *
   */
  private InputStream is = null;

  /**
   *
   * @param fileName String
   */
  public XMLConfiguration(String fileName) {
    this(new File(fileName));
  }

  /**
   *
   * @param file File
   */
  public XMLConfiguration(File file) {
    try {
      this.is = new FileInputStream(file);
    }
    catch (FileNotFoundException ex) {
    }
  }

  /**
   *
   * @param is InputStream
   */
  public XMLConfiguration(InputStream is) {
    this.is = is;
  }

  /**
   * loadConfiguration
   */
  public void loadConfiguration() throws ConfigurationReadingException {

    logger.debug("Reading Configuration");

    SPARROWCONFIG sparrowConfig = null;

    try {

      if (this.is == null) {
        throw new ConfigurationReadingException(
            "Configuration file could not be located in the classpath");
      }

      JAXBContext jc = JAXBContext.newInstance(PACKAGE_NAME);
      Unmarshaller u = jc.createUnmarshaller();
      sparrowConfig = (SPARROWCONFIG) u.unmarshal(this.is);
    }
    catch (JAXBException ex) {
      throw new ConfigurationReadingException(ex);
    }
    finally {
      if (is != null) {
        try {
          is.close();
        }
        catch (IOException ex1) {
          throw new ConfigurationReadingException(ex1);
        }
      }
    }

    /**/
    setModule(new ModuleConfigImpl(sparrowConfig.getMODULE()));
    setResources(new ResourcesConfigImpl(sparrowConfig.getRESOURCES()));
    setServices(new ServicesConfigImpl(sparrowConfig.getSERVICES()));
    setDataProviders( (new DataProvidersConfigImpl(sparrowConfig.getDATAPROVIDERS())));
    setDataExtractor(new DataExtractorConfigImpl(sparrowConfig.getDATAEXTRACTOR()));
    setDataWriters(new DataWritersConfigImpl(sparrowConfig.getDATAWRITERS()));
    setDataLookUp(new DataLookUpConfigImpl(sparrowConfig.getDATALOOKUP()));
    setDataTransformer(new DataTransformerConfigImpl(sparrowConfig.getDATATRANSFORMER()));
    setExceptionConfig(new ExceptionHandlerConfigImpl(sparrowConfig.getEXCEPTIONHANDLER()));
    setNotifiers(new NotifiersConfigImpl(sparrowConfig.getNOTIFIERS()));

    logger.debug("Configuration Initialized");

    //ConfigValidator validator = new ConfigValidator(sparrow);
    //validator.validate();

    sparrowConfig = null;
  }

}
