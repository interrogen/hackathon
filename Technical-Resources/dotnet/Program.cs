using System.Threading.Tasks;
using System.Net.Http.Headers;
using Newtonsoft.Json.Linq;

namespace dotnet
{
    class Program
    {

        private static HttpClient client = new HttpClient();
        private static string CAT_URL = "https://catfact.ninja/fact";
        private static string GITHUB_URL = "https://api.github.com/repos/robot297/hello-world";

        private static async Task GetCatFact()
        {
            client.DefaultRequestHeaders.Accept.Clear();
            
            var response = client.GetStringAsync(CAT_URL);
            var msg = await response;
            Console.WriteLine(JObject.Parse(msg)["fact"]);
        }

        private static async Task GetGitHubInfo()
        {
            client.DefaultRequestHeaders.Accept.Clear();
            client.DefaultRequestHeaders.Accept.Add(
                new MediaTypeWithQualityHeaderValue("application/vnd.github.v3+json"));

            client.DefaultRequestHeaders.Add("Authorization", "token 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");

            var response = client.GetStringAsync(GITHUB_URL);
            var msg = await response;
            Console.WriteLine(msg);
        }

        static async Task Main(string[] args)
        {
            await GetCatFact();
            // await GetGitHubInfo();
        }
    }
}
