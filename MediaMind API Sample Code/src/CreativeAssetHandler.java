import java.rmi.RemoteException;
import api.eyeblaster.com.Ad.AdServiceStub;
import api.eyeblaster.com.CreativeAsset.CreativeAssetServiceStub;
import api.eyeblaster.com.V1.DataContracts.CreativeAsset.CreativeAssetInfo;
import api.eyeblaster.com.message.CreativeAsset.ListPaging;
import api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetsRequest;
import api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetsResponse;
import api.eyeblaster.com.message.CreativeAsset.UserSecurityToken;

public class CreativeAssetHandler {

	/**
	 * @param args
	 */
	UserSecurityToken securityToken;
	AdServiceStub adServiceStub;
	CreativeAssetServiceStub creativeAssetServiceStub;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public CreativeAssetHandler(String tokenString) throws RemoteException
	{
		creativeAssetServiceStub = new CreativeAssetServiceStub();
		securityToken = new UserSecurityToken();
		securityToken.setUserSecurityToken(tokenString);
	}
	
	public CreativeAssetInfo GetAssetByType(AssetType assetType) throws RemoteException
	{
		GetCreativeAssetsRequest getCreativeAssetsRequest = new GetCreativeAssetsRequest();
		getCreativeAssetsRequest.setPaging(GetListPaging());
		
		GetCreativeAssetsResponse getCreativeAssetsResponse = creativeAssetServiceStub.GetCreativeAssets(getCreativeAssetsRequest , securityToken);
		
		CreativeAssetInfo[] creativeAssets = getCreativeAssetsResponse.getCreativeAssets().getCreativeAssetInfo();
		
		for(int i=0 ; i<creativeAssets.length ; i++)
		{
			if(creativeAssets[i].getAssetType().getAssetType().equals(assetType.name()))
			{
				return creativeAssets[i];
			}
		}
		
		return null;
	}
	
	private ListPaging GetListPaging()
	{
		ListPaging paging = new ListPaging();
		paging.setPageIndex(0);
		paging.setPageSize(50);

		return paging;
	}
}
