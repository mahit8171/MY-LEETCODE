import fs from "fs";
import fetch from "node-fetch";

const SESSION = process.env.LEETCODE_SESSION;

async function fetchSubmissions() {
  const res = await fetch("https://leetcode.com/api/submissions/", {
    headers: {
      cookie: `LEETCODE_SESSION=${SESSION}`
    }
  });

  const data = await res.json();
  return data.submissions_dump;
}

function saveSolution(title, code) {
  const safeName = title.replace(/[^a-z0-9]/gi, "_").toLowerCase();
  const path = `my-submissions/${safeName}.py`;

  fs.writeFileSync(path, code);
}

async function main() {
  const submissions = await fetchSubmissions();

  if (!submissions) {
    console.log("No submissions found");
    return;
  }

  for (let sub of submissions.slice(0, 20)) {
    if (!sub.code) continue;

    saveSolution(sub.title_slug, sub.code);
  }

  console.log("Sync complete");
}

main();
