.class public final synthetic Lax/a1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Lax/a1/B$a;

.field public final synthetic q:Lax/a1/z$a;


# direct methods
.method public synthetic constructor <init>(Lax/a1/z$a;Lax/a1/B$a;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/a1/o;->q:Lax/a1/z$a;

    iput-object p2, p0, Lax/a1/o;->c0:Lax/a1/B$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a1/o;->q:Lax/a1/z$a;

    iget-object v1, p0, Lax/a1/o;->c0:Lax/a1/B$a;

    invoke-static {v0, v1}, Lax/a1/z$a;->i(Lax/a1/z$a;Lax/a1/B$a;)V

    return-void
.end method
