package gred.nucleus.plugins;
import gred.nucleus.core.*;

import ij.*;
import ij.plugin.*;

public class ConvexHull_  implements PlugIn
{

	ImagePlus _imagePlusInput;
	
	/**
	 * This method permit to execute the ReginalExtremFilter on the selected image
	 * 
	 * @param arg 
	 */
	public void run(String arg)
	{
		_imagePlusInput = WindowManager.getCurrentImage();
	    if (null == _imagePlusInput)
	    {
	       IJ.noImage();
	       return;
	    }		
	    NucleusSegmentationConvexeHull nuc = new NucleusSegmentationConvexeHull();
		nuc.giftWrapping(_imagePlusInput);
		
	}
}